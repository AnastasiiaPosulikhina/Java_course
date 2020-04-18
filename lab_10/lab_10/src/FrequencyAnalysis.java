public class FrequencyAnalysis implements Runnable {
    String doc;
    public FrequencyAnalysis(String doc) {
        this.doc = doc;
    }
    @Override
    public void run() {
        synchronized (AnalysisCheck.frequency) { //запрет выполнения опред. метода, выполняющегося другим потоком
            for (int i = 0; i < doc.length(); i++) {
                Integer counter = AnalysisCheck.frequency.get(doc.charAt(i));
                if (counter == null) { //если символа нет в словаре, то он добавляется
                    AnalysisCheck.frequency.put(doc.charAt(i), 1);
                } else {
                    AnalysisCheck.frequency.put(doc.charAt(i), ++counter); //если символ есть в словаре, то кол-во увеличивается на 1
                }
            }
            System.out.println("Получение частот появления всех символов окончено.");
        }
    }
}
