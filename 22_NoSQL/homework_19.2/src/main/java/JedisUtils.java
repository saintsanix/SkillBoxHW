import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JedisUtils {

    private static Jedis jedis = new Jedis("localhost", 6379);
    private static final List<String> USER_LIST = generateUsersList();
    private static final long USER_COUNT = 20L;

    public void jedisConnect() {

        System.out.println ("Подключение успешно");
        System.out.println ("Ping: " + jedis.ping());
        System.out.println ("Очистка данных: " + jedis.flushDB());
    }


    public void fillDataBase() {
        USER_LIST.forEach(e -> jedis.rpush("user#list", e));
    }

    public String datingSite(Long user) throws InterruptedException {
        Thread.sleep(600);
        return jedis.lindex("user#list", user);
    }

    public long randomUserPayForUp() {
        long min = 1L;
        long max = 20L;
        return Math.round((Math.random()*(max-min))+min);
    }

    public static List<String> generateUsersList() {
        List<String> userList = new ArrayList<>();
        for (int i = 1; i <= USER_COUNT; i++) {
            userList.add("Пользователь №" + i);
        }
        return userList;
    }

}