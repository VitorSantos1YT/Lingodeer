package fg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends dg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i11) {
        super(str, 1);
        this.f27256b = i11;
    }

    @Override // dg.a
    public final void a(int i11, Object obj) {
        switch (this.f27256b) {
            case 0:
                ((e) obj).setAlpha(i11);
                break;
            case 1:
                ((e) obj).f27266t = i11;
                break;
            case 2:
                ((e) obj).M = i11;
                break;
            case 3:
                ((e) obj).H = i11;
                break;
            case 4:
                ((e) obj).K = i11;
                break;
            default:
                ((e) obj).L = i11;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f27256b) {
            case 0:
                return Integer.valueOf(((e) obj).Q);
            case 1:
                return Integer.valueOf(((e) obj).f27266t);
            case 2:
                return Integer.valueOf(((e) obj).M);
            case 3:
                return Integer.valueOf(((e) obj).H);
            case 4:
                return Integer.valueOf(((e) obj).K);
            default:
                return Integer.valueOf(((e) obj).L);
        }
    }
}
