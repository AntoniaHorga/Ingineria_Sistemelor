package lab9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mainLab9 {
    void main() {
        //ex1
        System.out.println("ex1\n");
        Random random = new Random();
        List<Integer> numbers = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers);
        //a
        int sum=numbers.stream().mapToInt(n->n).sum();
        System.out.println("Suma= "+sum);
        //b
        Integer max=numbers.stream().max(Comparator.naturalOrder()).get();
        Integer min=numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Maxim= "+max);
        System.out.println("Minim= "+min);
        //c
        List<Integer>filtered=numbers.stream()
                .filter(n->n>=10 && n<=20)
                .collect(Collectors.toList());
        System.out.println("Elementele intre 10 si 20: "+filtered);
        //d
        List<Double>doubleList=numbers.stream()
                .map(n->Double.valueOf(n))
                .collect(Collectors.toList());
        System.out.println("Lista double: "+doubleList);
        //e
        boolean contains12=numbers.stream()
                .anyMatch(n->n==12);
        System.out.println("Exista 12? "+contains12);
        //ex2
        System.out.println("ex2\n");
        String text="Acesta este un program scris in java pentru expresii lambda";
        List<String>words= Arrays.asList(text.split(" "));
        System.out.println(words);
        //a
        List<String>filteredwords=words.stream()
                .filter(word->word.length()>=5)
                .collect(Collectors.toList());
        System.out.println(filteredwords);
        long count=words.stream()
                .filter(word->word.length()>=5)
                .count();
        System.out.println("Numar cuvinte: "+count);
        //b
        List<String>sortedWords=filteredwords.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedWords);
        //c
        Optional<String> wordP=words.stream()
                .filter(word->word.startsWith("p"))
                .findFirst();
        if(wordP.isPresent()){
            System.out.println("Cuvant cu p gasit: "+wordP.get());
        }



    }
}
