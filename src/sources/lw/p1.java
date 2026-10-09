package lw;

import com.google.common.base.Charsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum p1 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int value;
    private final byte[] valueAscii;

    p1(int i11) {
        this.value = i11;
        this.valueAscii = Integer.toString(i11).getBytes(Charsets.f16352a);
    }

    public static byte[] a(p1 p1Var) {
        return p1Var.valueAscii;
    }

    public final q1 b() {
        return (q1) q1.f40433d.get(this.value);
    }

    public final int c() {
        return this.value;
    }
}
