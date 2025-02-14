public class GenericPrinter<T extends  Material> {

    // T : 자료형 변수
    private T material;
    
    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString(){
        return material.toString();
    }


    public void printing() {
        material.toString();
    }

}
