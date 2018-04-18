package mx.com.kubo.preventers.reports.impl;

import mx.com.kubo.preventers.reports.InvoicePrinter;
import mx.com.kubo.preventers.reports.print.BillPrinter;
import mx.com.kubo.preventers.reports.print.impl.AsciiPrinter;
import mx.com.kubo.preventers.reports.print.impl.HtmlPrinter;
import mx.com.kubo.preventers.reports.print.impl.XmlPrinter;

import java.math.BigDecimal;
import java.util.List;

public class Invoice implements InvoicePrinter {

    private List<Item> lineItem;
    private String customer;
    private BigDecimal total;

    public Invoice(List<Item> lineItem, String customer) {
        this.lineItem = lineItem;
        this.customer = customer;
    }

    @Override
    public String asciiStatement() {
        return statement(new AsciiPrinter());
    }

    @Override
    public String htmlStatement() {
        return statement(new HtmlPrinter());
    }

    @Override
    public String xmlStatement() {
        return statement(new XmlPrinter());
    }

    private String statement(BillPrinter billPrinter) {
        String s = billPrinter.header(customer);
        total = BigDecimal.ZERO;
        for(Item item: lineItem) {
            s+=billPrinter.item(item);
            total = total.add(item.getPrice());
        }

        s+=billPrinter.total(total);
        return s;
    }

    public List<Item> getLineItem() {
        return lineItem;
    }


}
