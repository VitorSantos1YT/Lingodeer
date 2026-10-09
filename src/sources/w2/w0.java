package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements s1, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w0 f54597b = new w0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54598a;

    public /* synthetic */ w0(int i11) {
        this.f54598a = i11;
    }

    @Override // w2.j
    public long a(long j11, long j12) {
        switch (this.f54598a) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i11 = k1.f54535a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i12 = k1.f54535a;
                return jFloatToRawIntBits2;
            case 3:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                int i13 = k1.f54535a;
                return jFloatToRawIntBits3;
            case 4:
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                int i14 = k1.f54535a;
                return jFloatToRawIntBits4;
            case 5:
                float fC = a0.c(j11, j12);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                int i15 = k1.f54535a;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j11 >> 32)) <= Float.intBitsToFloat((int) (j12 >> 32)) && Float.intBitsToFloat((int) (j11 & 4294967295L)) <= Float.intBitsToFloat((int) (j12 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i16 = k1.f54535a;
                    return jFloatToRawIntBits6;
                }
                float fC2 = a0.c(j11, j12);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
                int i17 = k1.f54535a;
                return jFloatToRawIntBits7;
        }
    }

    @Override // w2.s1
    public boolean h(Object obj, Object obj2) {
        return false;
    }

    @Override // w2.s1
    public void i(r1 r1Var) {
        r1Var.clear();
    }

    public String toString() {
        switch (this.f54598a) {
            case 7:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
