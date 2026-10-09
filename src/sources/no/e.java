package no;

import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.core.SnapshotHolder;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.lingo.lingoskill.speak.object.PodUser;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Transaction.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PodUser f43865a;

    public e(PodUser podUser) {
        this.f43865a = podUser;
    }

    @Override // com.google.firebase.database.Transaction.Handler
    public final Transaction.Result a(MutableData mutableData) {
        boolean zC = mutableData.c();
        PodUser podUser = this.f43865a;
        if (!zC) {
            mutableData.a(podUser.getUid()).d(podUser.toTopMap());
            return Transaction.a(mutableData);
        }
        ArrayList arrayList = new ArrayList();
        if (mutableData.c()) {
            for (MutableData mutableData2 : mutableData.b()) {
                SnapshotHolder snapshotHolder = mutableData2.f18983a;
                Object objB = CustomClassMapper.b(PodUser.class, snapshotHolder.f19289a.I(mutableData2.f18984b).getValue());
                kotlin.jvm.internal.m.c(objB);
                arrayList.add(objB);
            }
        }
        if (arrayList.size() > 1) {
            ry.p.Z(arrayList, new gu.g(8));
        }
        if (arrayList.contains(podUser) || arrayList.size() >= 10) {
            return Transaction.a(mutableData);
        }
        mutableData.a(podUser.getUid()).d(podUser.toTopMap());
        return Transaction.a(mutableData);
    }
}
