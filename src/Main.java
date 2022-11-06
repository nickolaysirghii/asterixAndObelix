public class Main {
    public static void main(String[] args) {
        // Level1: Астерикс и Обеликс варили зелье ,
        // Зелье будет сварено правильно, если его будут варить больше 5 часов.
        // Астерикс варил его 3 часа,Обеликс в два раза меньше.
        // Получится ли у них сварить зелье? true - если получится, иначе false


       // Level2: Вводится число. Если оно четное, то выведите true, иначе false

        int asterix   =   3;
        int obelix    =   ( asterix  /   2);

        boolean potion =(asterix   +   obelix  >= 5);
        System.out.println(potion);


    }
}