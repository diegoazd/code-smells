package mx.com.kubo.preventers.reports.print.impl;

import mx.com.kubo.preventers.reports.impl.Item;
import mx.com.kubo.preventers.reports.print.BillPrinter;

import java.math.BigDecimal;

public class AsciiPrinter implements BillPrinter {
    @Override
    public String header(String customer) {
        return "Bill for "+customer+"\n";
    }

    @Override
    public String item(Item item) {
        return "\t"+item.getName()+"\t\t"+
               item.getPrice()+"\n";
    }

    @Override
    public String total(BigDecimal total) {
        return "total owed: "+total;
    }
}
