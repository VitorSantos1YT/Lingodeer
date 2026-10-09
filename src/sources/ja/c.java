package ja;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    String B0(int i11);

    void b0(int i11, String str);

    void e0(double d5);

    void g(int i11, long j11);

    int getColumnCount();

    String getColumnName(int i11);

    double getDouble(int i11);

    long getLong(int i11);

    boolean isNull(int i11);

    boolean r1();

    void reset();

    void s(int i11);
}
