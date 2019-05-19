import java.util.Date;

// В этой программе создается специальный тип исключения
class MyException extends Exception {
    private int detail ;
    MyException (int а){
        detail = а;
    }
    public String toString () {
        return "MyException [ " + detail + " ] ";
    }
}
class ExceptionDemo {
    static void compute(int a)throws MyException {
        System.out.println("Bызвaн метод compute ( " + a + " ) ");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Hopмaльнoe завершение");
    }
    public static void main ( String args [ ] ) {
        try {
            compute(1);
            compute(20);
        } catch (MyException е ){
            Date date = new Date();
            System.out.println(date);//дата и время
            System.out.println("Пepexвaчeнo исключение : " + е);//сообщение строки
        }

    }
}