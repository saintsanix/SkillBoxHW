import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        System.out.println ("����������� �������");
        System.out.println ("Ping: " + jedis.ping ());

        System.out.println ("������� ������: " + jedis.flushDB ());

        jedis.sadd("todo", "������ ������");
        jedis.sadd("todo", "��������� ������");
        jedis.sadd("todo", "��������� ����");
        jedis.sadd("todo", "��������� ����");
        jedis.sadd("todo", "������ ������");
        System.out.println ("��� ����:" + jedis.smembers("todo"));
        System.out.println("��������������� ���� ���������");
        jedis.srem("todo", "��������� ������");
        jedis.srem("todo", "��������� ����");
        jedis.srem("todo", "������ ������");
        System.out.println ("��� ����:" + jedis.smembers("todo"));
        System.out.println("====================================");
        jedis.hincrBy("������ �.�.", "���-����������. ��������� �������", 1);
        jedis.hincrBy("������ �.�.", "Data Science. ��������� �������", 4);
        System.out.println(jedis.hkeys("������ �.�."));
        System.out.println(jedis.hvals("������ �.�."));
        jedis.hincrBy("������ �.�.", "Data Science. ��������� �������", 1);
        System.out.println(jedis.hgetAll("������ �.�."));

    }
}