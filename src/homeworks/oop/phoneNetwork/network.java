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

public class network {
    private int phoneNumber;
    private int[] base1 = new int[10];

    public int[] getBase1() {
        return base1;
    }

    public void setBase1(int[] base1) {
        this.base1 = base1;
    }

    public network(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public network() {

    }



    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    //registration in the network
    public boolean InTheNetwork(int phoneNumber) {
        for (int i = 0; i < base1.length; i++) {
            if (base1[i] == phoneNumber) {
                break;
            } else if (base1[i] == 0) {
                base1[i] = phoneNumber;
                break;
            }
        }
        return true;
    }


      // is phone registered in the network?
    public boolean phoneIsRegistered (int phone){
        boolean isRegistered = false;
        for (int i = 0; i < base1.length; i++) {
            if (base1[i] == phone ){
                isRegistered = true;
                break;
            }
        }
    return isRegistered;
    }

    public String incomingcall(int PhoneNumberToBeCalled) {
        return "You have an incoming call from a number " + PhoneNumberToBeCalled;

    }

    public String outgoingcall(int phoneNumber, int PhoneNumberToBeCalled) {
        if ( phoneIsRegistered(phoneNumber) == false ){
            return "Phone number " + phoneNumber + " not registered on the network.";
        } else if (phoneIsRegistered(PhoneNumberToBeCalled) == true) {
            return incomingcall(PhoneNumberToBeCalled);
        } else {
            return "Phone number " + PhoneNumberToBeCalled + " not registered on the network.";
        }


    }
}

