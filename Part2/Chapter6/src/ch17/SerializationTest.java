package ch17;

import java.io.*;

class Person1 implements Serializable {
    String name;
     String job;

    public Person1() {}
    public Person1(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + ", " + job;
    }

}

class Person2 implements Externalizable {
    String name;
    String job;

    public Person2() {}
    public Person2(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + ", " + job;
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {
        obj.writeUTF(name);
        obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
        name = obj.readUTF();
        job = obj.readUTF();
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person1 personLee = new Person1("이순신", "대표이사");
        Person1 personKim = new Person1("김유신", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee);
            oos.writeObject(personKim);
        } catch(IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person1 pLee = (Person1)ois.readObject();
            Person1 pKim = (Person1)ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);
        } catch(IOException e1) {
            System.out.println(e1);
        } catch(ClassNotFoundException e2) {
            System.out.println(e2);
        }


        Person2 personLee2 = new Person2("이순신", "대표이사");
        Person2 personKim2 = new Person2("김유신", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee2);
            oos.writeObject(personKim2);
        } catch(IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person2 pLee = (Person2)ois.readObject();
            Person2 pKim = (Person2)ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);
        } catch(IOException e1) {
            System.out.println(e1);
        } catch(ClassNotFoundException e2) {
            System.out.println(e2);
        }
    }
}
