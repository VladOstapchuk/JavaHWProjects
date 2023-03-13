package homeworks.oop.phoneNetwork;

// Создайте класс Phone (Телефон) одним из свойств должен быть его номер. Создайте
//класс Network (сеть мобильного оператора). В классе Телефон должны быть описаны
//следующие методы:
//● Регистрация в сети мобильного оператора
//● Метод реализующий исходящий звонок. Данный метод принимает один параметр
//(описывающий номер мобильного телефона). Логика работы этого метода такова:
//если текущий телефон не прошел регистрацию в сети, то закончить работу метода с
//сообщением об этом. Если текущий телефон прошел регистрацию и в сети также
//зарегистрирован телефон на номер которого совершается вызов, то вызвать метод
//входящий звонок у того телефона. Если телефон на номер которого вы совершаете
//вызов в сети не зарегистрирован, то закончить работу метода с сообщением об
//этом.
//● Метод реализующий входящий звонок. Принимает параметр в виде номера с
//которого произвели вызов на текущий. Вывести сообщение вида вам звонит номер
//такой то.


public class callphone {
    public static void main(String[] args) {

        int vladPhoneNumber = 501111111;
        int iraPhoneNumber = 502222222;

        Phone vladPhone = new Phone(vladPhoneNumber);
        Phone iraPhone = new Phone(iraPhoneNumber);


        // network registration
        network testNetwork = new network();
        testNetwork.InTheNetwork(vladPhone.getPhoneNumber());
        testNetwork.InTheNetwork(iraPhone.getPhoneNumber());

        // incoming call
        System.out.println(testNetwork.incomingcall(vladPhone.getPhoneNumber()));
        System.out.println(testNetwork.incomingcall(iraPhone.getPhoneNumber()));


        //outgoingcall

        System.out.println(testNetwork.outgoingcall(vladPhone.getPhoneNumber(), iraPhone.getPhoneNumber()));



    }





}