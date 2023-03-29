import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    Line line1, line2, line3;
    StationIndex stationIndex;
    RouteCalculator routeCalc;
    List<Station> connect1, connect2;

    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();
        stationIndex = new StationIndex();

        line1 = new Line(1, "������");
        line2 = new Line(2, "������");
        line3 = new Line(3, "������");

        route.add(new Station("��1-�1", line1));
        route.add(new Station("��2-�1", line1));
        route.add(new Station("��3-�1", line1));
        route.add(new Station("��1-�2", line2));
        route.add(new Station("��2-�2", line2));
        route.add(new Station("��3-�2", line2));
        route.add(new Station("��1-�3", line3));
        route.add(new Station("��2-�3", line3));
        route.add(new Station("��3-�3", line3));

        line1.addStation(route.get(0));
        line1.addStation(route.get(1));
        line1.addStation(route.get(2));
        line2.addStation(route.get(3));
        line2.addStation(route.get(4));
        line2.addStation(route.get(5));
        line3.addStation(route.get(6));
        line3.addStation(route.get(7));
        line3.addStation(route.get(8));

        connect1 = new ArrayList<Station>() {{
            add(route.get(2));
            add(route.get(5));
        }};
        connect2 = new ArrayList<Station>() {{
            add(route.get(3));
            add(route.get(6));
        }};

        addStations(stationIndex, route);
        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        stationIndex.addConnection(connect1);
        stationIndex.addConnection(connect2);
        routeCalc = new RouteCalculator(stationIndex);
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route.subList(0, 5));
        double expected = 11;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine()    //���� ��� ���������
    {
        Station from = stationIndex.getStation("��1-�1");
        Station to = stationIndex.getStation("��3-�1");
        List<Station> actual = routeCalc.getShortestRoute(from, to);
        List<Station> expected = route.subList(0, 3);
        assertEquals(expected, actual);
    }

    public void testGetRouteWithOneConnection()        //���� � ����� ����������
    {
        Station from = stationIndex.getStation("��1-�1");
        Station to = stationIndex.getStation("��2-�2");
        List<Station> actual = routeCalc.getShortestRoute(from, to);
        List<Station> expected = new ArrayList<Station>() {{
            addAll(route.subList(0, 3));
            add(route.get(5));
            add(route.get(4));
        }};
        assertEquals(expected, actual);
    }

    public void testGetRouteWithTwoConnections()       //���� � ����� �����������
    {
        Station from2 = stationIndex.getStation("��1-�1");
        Station to2 = stationIndex.getStation("��3-�3");
        List<Station> actual2 = routeCalc.getShortestRoute(from2, to2);
        List<Station> expected2 = new ArrayList<Station>() {{
            addAll(route.subList(0, 3));
            add(route.get(5));
            add(route.get(4));
            add(route.get(3));
            addAll(route.subList(6, 9));
        }};
        assertEquals(expected2, actual2);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    protected void addStations(StationIndex stIn, List<Station> stations) {
        for (Station station : stations) {
            stIn.addStation(station);
        }
    }
}