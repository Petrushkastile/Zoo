public abstract class AdditionalInfo implements Animal{

    public abstract String getImage();

    public abstract String getInfo();

    @Override
    public String toString() {
        return getAnimalClass()+'\n'+"AdditionalInfo:" +
                getInfo()+getImage();
    }}