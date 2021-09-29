package dto;

import model.Bill;

public class BillDTO {

    public Bill tranferObjectBill(Bill bill) {

        Bill billtranfer = new Bill();

        billtranfer.setBillId(bill.getBillId());
        billtranfer.setBooking(bill.getBooking());
        billtranfer.setNote(bill.getNote());
        billtranfer.setPaymentDate(bill.getPaymentDate());
        billtranfer.setTotalAmount(bill.getTotalAmount());
        billtranfer.setUser(bill.getUser());
        billtranfer.setPaymentType(bill.getPaymentType());

        return billtranfer;
    }
}
