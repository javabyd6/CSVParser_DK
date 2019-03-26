package pl.sda.csvparser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
/*
        try {
        parser.groupByCity(parser.readFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        /*try {
            System.out.println(parser.readFile().size());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Map<String, List<RealEstate>> map = null;
        try {
            map = parser.readFile().stream().collect(Collectors.groupingBy(RealEstate::getCity));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map.size());
/*List<RealEstate> realEstateList = new ArrayList<>();
realEstateList.addAll(parser.readFile());
parser.groupByCity(realEstateList);*/
    }
}
