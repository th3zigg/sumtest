package me.zach.demo.sum;

public class SumService {
    private DataService dataService;

    public SumService(DataService dataService) {
        this.dataService = dataService;
    }

    public int sum(int a, int b) {
        dataService.getSavedNumbers();
        return a + b;
    }
}
