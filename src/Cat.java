public class Cat  extends AbstractAnimal implements Animal{

        private int age;
        private String name;
        private String imageC;
        private String infoC;
        private int maxAge;

        @Override
        public String getImage() {
            imageC=  '\n'+"____$$"+'\n'+
                    "___$__$$$"+'\n'+
                    "___$_____$$$$$$$$____$$$$$$$$"+'\n'+
                    "___$_$$$_$_$____$$$$$$$____$"+'\n'+
                    "___$__$$_$___________$_$$$_$"+'\n'+
                    "___$$__________________$__$$"+'\n'+
                    "__$$_____________________$$"+'\n'+
                    "_$$______$$______$______$$"+'\n'+
                    "_$______$$$$___$$$$_______$"+'\n'+
                    "_$__$$$$$$_$$__$_$________$"+'\n'+
                    "_$$______$__$$$__$$$$$$__$$"+'\n'+
                    "__$$_________$____$$$_$_$$"+'\n'+
                    "___$$$___$$_$$$_$$_____$$"+'\n'+
                    "__$$_________$_________$$$$"+'\n'+
                    "__$____________________$___$$$"+'\n'+
                    "__$_________________________$$$____$$"+'\n'+
                    "__$__________________________$$$_$$$$"+'\n'+
                    "__$______________________________$$$__$"+'\n'+
                    "___$$_____________$_____$$_______$$___$"+'\n'+
                    "____$$_$$_______$$$______$________$___$"+'\n'+
                    "____$$__$$____$$$________$_________$__$"+'\n'+
                    "_____$___$$$__$_________$$_________$_$$"+'\n'+
                    "_____$$____$$$$________$$_____$____$$"+'\n'+
                    "______$______$$_____$$$_____$$$$___$"+'\n'+
                    "______$______$_______$__$$$$______$$"+'\n'+
                    "______$$_____$_______$_$________$$"+'\n'+
                    "_______$_____$_______$$$$_$_$_$$$"+'\n'+
                    "______$$_______$$$$$$__$$$$$$$$"+'\n'+
                    "______$________$"+'\n'+
                    "______$$$$$$$$$$";
            return imageC;
        }


        @Override
        public String getInfo() {

            return infoC+'\n';
        }

        public void setInfo(String infoC) {
        this.infoC = infoC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {



         this.age = age;
                }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxAge() {

            return maxAge=20;
    }


    @Override
        public String say() {return  "мррррр-Мяу" ;
        }

        @Override
        public String getAnimalClass() {
            return "Кот:  ";
        }



        @Override
        public String toString() {
            return getAnimalClass() +
                    " name= '"+ name +"',  age=" + age +
                     ";";

        }


}


