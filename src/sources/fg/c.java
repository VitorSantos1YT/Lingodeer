package fg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends dg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i11) {
        super(str, 0);
        this.f27255b = i11;
    }

    @Override // dg.a
    public final void b(Object obj, float f5) {
        switch (this.f27255b) {
            case 0:
                ((e) obj).g(f5);
                break;
            case 1:
                ((e) obj).N = f5;
                break;
            case 2:
                ((e) obj).O = f5;
                break;
            case 3:
                ((e) obj).f27261b = f5;
                break;
            default:
                ((e) obj).f27262c = f5;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f27255b) {
            case 0:
                return Float.valueOf(((e) obj).f27260a);
            case 1:
                return Float.valueOf(((e) obj).N);
            case 2:
                return Float.valueOf(((e) obj).O);
            case 3:
                return Float.valueOf(((e) obj).f27261b);
            default:
                return Float.valueOf(((e) obj).f27262c);
        }
    }
}
