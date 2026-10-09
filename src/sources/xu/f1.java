package xu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f56398b = new f1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f56399c = new f1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56400a;

    public /* synthetic */ f1(int i11) {
        this.f56400a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f56400a) {
            case 0:
                LeaderBoardUser it = (LeaderBoardUser) obj;
                kotlin.jvm.internal.m.f(it, "it");
                break;
            default:
                LeaderBoardUser it2 = (LeaderBoardUser) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                break;
        }
        return qy.b0.f48488a;
    }
}
