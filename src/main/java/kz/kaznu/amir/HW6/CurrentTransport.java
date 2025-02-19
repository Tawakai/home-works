package kz.kaznu.amir.HW6;

public interface CurrentTransport {
    boolean ableToMove(Biom biom);
    boolean move(int distance, Biom biom);
}
