package leetcode.problems.easy;

import leetcode.prepare.RandomCollections;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class SellAndStock121 {
    public static void main(String[] args) {
        int[] stock = RandomCollections.getRandomArray(10, 0, 10);

        int minPrice = stock[0];
        int best = 0;

        for (int i = 0; i < stock.length; i++) {

            best = Math.max(best, stock[i] - minPrice);
            log.info("{} шаг: выгода равна {}  ", i, best);
            minPrice = Math.min(minPrice, stock[i]);
            log.info("Минимальная цена на данный момент {}", minPrice);
        }
        log.info("🔥 Выгодная цена в Итоге{} ", best);
        log.info("Все числа {} ", Arrays.toString(stock));
    }
}
