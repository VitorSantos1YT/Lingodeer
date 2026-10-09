package y3;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import qy.b0;
import rt.qf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f57052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f57053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f57054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f57055e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57056a;

    static {
        int i11 = 1;
        f57052b = new b(i11, 0);
        f57053c = new b(i11, 1);
        f57054d = new b(i11, 2);
        f57055e = new b(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12) {
        super(i11);
        this.f57056a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f57056a) {
            case 0:
                AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj;
                androidViewHolder.getHandler().post(new qf(4, androidViewHolder.T));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return b0.f48488a;
    }
}
