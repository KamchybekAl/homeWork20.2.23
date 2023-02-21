package homeWork_2_MuzInstruments;
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
//Создать массив типа Инструмент, содержащий инструменты разного типа.
//В цикле вызвать метод play() для каждого инструмента, который должен выводить
//строку "Играет такой-то инструмент, с такими-то характеристиками".
public class Main {
    public static void main(String[] args) {

        Instrument [] instrument1 = {(Instrument) new Guitar(7),(Instrument) new Drum(4),  (Instrument) new Trumpet(3)};

        for (int i = 0; i < instrument1.length; i++) {
            instrument1[i].play();

        }



    }

}
