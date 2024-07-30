package com.wimoor.sys.gc.util;import lombok.Data;import java.lang.reflect.Field;import java.util.*;/** * 随机工具类 * * @author wangsong * @email 1720696548@qq.com * @date 2022/3/16 15:10 */public class RandomUtil {    private static final Random RANDOM = new Random();    /**     * 随机从 list 中获取一条数据     * <p>     * 权重, 权重值越大, 随机到的几率就越大     * 如果需要线程安全，集合可以使用 Vector     * </p>     *     * @param list      数据对象     * @param weightKey 权重key, 如果 T 不是实体类或者不使用权重 weightKey传递 null 即可     * @param isRemove  获取后是否从 List中移除该对象     * @return 删除     */    public static <T> T randomOneByList(List<T> list, String weightKey, Boolean isRemove) {        if (list == null || list.size() == 0) {            return null;        }        if (weightKey == null) {            int index = RANDOM.nextInt(list.size());            T t = list.get(index);            if (isRemove != null && isRemove) {                list.remove(t);            }            return t;        } else {            // 获取总权重            Integer weightTotal = 0;            // key=权重，value=值            Map<Integer, T> map = new HashMap<>(list.size());            for (T item : list) {                Class<?> aClass = item.getClass();                try {                    Field field = aClass.getDeclaredField(weightKey);                    field.setAccessible(true);                    Integer weight = Integer.parseInt(field.get(item).toString());                    weightTotal += weight;                    map.put(weightTotal, item);                } catch (NoSuchFieldException | IllegalAccessException e) {                    e.printStackTrace();                }            }            // 当前权重            int weight = RANDOM.nextInt(weightTotal);            for (Integer key : map.keySet()) {                if (key >= weight) {                    T t = map.get(key);                    if (isRemove != null && isRemove) {                        list.remove(t);                    }                    return t;                }            }            return null;        }    }    /**     * 随机从Map 中获取一条数据     *     * @param map     * @return     */    public static <K, V> V randomOneByMap(Map<K, V> map) {        if (map == null || map.size() == 0) {            return null;        }        int index = RANDOM.nextInt(map.size());        int oldIndex = 0;        for (K k : map.keySet()) {            oldIndex++;            if (oldIndex == index) {                return map.get(k);            }        }        return null;    }    @Data    public static class RandomTest {        private int id;        private int weight;    }}