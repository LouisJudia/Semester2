package Pertemuan12;

public class SingleLinkedList08 {
    Node08 head;
    Node08 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node08 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        Node08 temp = head;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa08 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
            return;
        }
        if (index == 0) {
            addFirst(input);
            return;
        }

        Node08 temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Indeks di luar batas");
                return;
            }
            temp = temp.next;
        }

        temp.next = new Node08(input, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }

    public void getData(int index) {
        Node08 tmp = head;
        for (int i = 0; tmp != null && i < index; i++) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            tmp.data.tampilInformasi();
        } else {
            System.out.println("Indeks di luar batas!");
        }
    }

    public int indexOf(String key) {
        Node08 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node08 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return;
        }

        if (head.data.nama.equalsIgnoreCase(key)) {
            removeFirst();
            return;
        }

        Node08 temp = head;
        while (temp.next != null) {
            if (temp.next.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Data dengan nama '" + key + "' tidak ditemukan!");
    }

    public void removeAt(int index) {
        if (index < 0 || head == null) {
            System.out.println("Indeks tidak valid atau Linked List kosong!");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node08 temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Indeks di luar batas!");
            return;
        }

        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
}