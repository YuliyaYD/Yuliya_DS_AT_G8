package homework.day4.task1.playground.runners;

import homework.day4.task1.playground.essence.creatures.Crawlable;
import homework.day4.task1.playground.essence.creatures.animals.insects.Beetle;
import homework.day4.task1.playground.essence.creatures.animals.insects.Insect;
import homework.day4.task1.playground.essence.creatures.animals.vertebrates.Crocodile;
import homework.day4.task1.playground.essence.creatures.animals.vertebrates.Vertebrate;
import homework.day4.task1.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrate vertebrateCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(crawlableBeetle);
        crawlableProcessor.runCrawlable((Crawlable) vertebrateCrocodile);
        crawlableProcessor.runCrawlable((Crawlable) insectBeetle);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);

        crawlableProcessor.runCrawlable(crawlableBeetle, "никуда");
        crawlableProcessor.runCrawlable(crawlableCrocodile, "налево");
        crawlableProcessor.runCrawlable(crawlableBeetle, "назад", 37);



    }
}
