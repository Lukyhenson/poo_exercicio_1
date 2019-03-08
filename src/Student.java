public class Student {
    public String name;
    private String classRom;
    public double va1, va2, va3, va4, media;

    Student() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setVa1(double va1) {
        this.va1 = va1;
    }

    public void setVa2(double va2) {
        this.va2 = va2;
    }

    public void setVa3(double va3) {
        this.va3 = va3;
    }

    public void setVa4(double va4) {
        this.va4 = va4;
    }

    public void setClassRom(String classRom) {
        this.classRom = classRom;
    }

    public String getName() {
        return name;
    }

    public double getVa1() {
        return va1;
    }

    public double getVa2() {
        return va2;
    }

    public double getVa3() {
        return va3;
    }

    public double getVa4() {
        return va4;
    }

    public String getClassRom() {
        return classRom;
    }

    public double getMedia() {
        return this.media = (this.va1 + this.va2 + this.va3 + this.va4) / 4;
    }

    public void getAllInfo() {
        System.out.println("========================================");
        System.out.println("| Student Name: " +  this.name);
        System.out.println("| ClassRoom: " +  this.classRom);
        System.out.println("| VA1: " +  this.va1);
        System.out.println("| VA2: " +  this.va2);
        System.out.println("| VA3: " +  this.va3);
        System.out.println("| VA4: " +  this.va4);
        System.out.println("| MEDIA: " +  this.getMedia());
        System.out.println("========================================");
    }
}
