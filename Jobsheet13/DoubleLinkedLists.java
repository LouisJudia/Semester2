public class DoubleLinkedLists {
    Node01 head;
    Node01 tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil terhapus. Data yang terhapus adalah: " + head.data.nim + " - " + head.data.nama);
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil terhapus. Data yang terhapus adalah:" + tail.data.nim + " - " + tail.data.nama);
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(Mahasiswa01 data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node01 newNode = new Node01(data);
        Node01 current = head;
        int i = 0;

        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Indeks di luar batas, menambahkan di akhir.");
            addLast(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    public void removeAfter(String keyNim) {
        Node01 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan atau tidak memiliki node setelahnya.");
            return;
        }

        Node01 temp = current.next;
        System.out.println("Data yang terhapus: " + temp.data.nim + " - " + temp.data.nama);

        current.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = current;
        } else {
            tail = current; 
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node01 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Indeks tidak ditemukan.");
            return;
        }

        System.out.println("Data yang terhapus: " + current.data.nim + " - " + current.data.nama);

        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    public Mahasiswa01 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        return head.data;
    }

    public Mahasiswa01 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa01 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }

        Node01 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Indeks tidak ditemukan.");
            return null;
        }

        return current.data;
    }

    public int size() {
        int count = 0;
        Node01 current = head;
        
        while (current != null) {
            count++;
            current = current.next;
        }
        
        return count;
    }

}