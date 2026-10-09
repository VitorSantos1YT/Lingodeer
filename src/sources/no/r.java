package no;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Query;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.SnapshotHolder;
import com.google.firebase.database.core.utilities.Validation;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.snapshot.PathIndex;
import com.lingo.lingoskill.speak.object.PodUser;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Transaction.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PodUser f43914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f43915b;

    public r(PodUser podUser, s sVar) {
        this.f43914a = podUser;
        this.f43915b = sVar;
    }

    @Override // com.google.firebase.database.Transaction.Handler
    public final Transaction.Result a(MutableData mutableData) {
        boolean zC = mutableData.c();
        PodUser podUser = this.f43914a;
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
            ry.p.Z(arrayList, new gu.g(11));
        }
        boolean zI0 = ry.m.i0(arrayList, podUser);
        s sVar = this.f43915b;
        if (!zI0) {
            if (arrayList.size() < 10) {
                mutableData.a(podUser.getUid()).d(podUser.toTopMap());
                return Transaction.a(mutableData);
            }
            if (podUser.getLike_num() <= ((PodUser) arrayList.get(0)).getLike_num()) {
                return Transaction.a(mutableData);
            }
            DatabaseReference databaseReference = sVar.f43918c;
            if (databaseReference == null) {
                kotlin.jvm.internal.m.n("mTopUserDb");
                throw null;
            }
            databaseReference.e(podUser.getUid()).h(null);
            mutableData.a(podUser.getUid()).d(podUser.toTopMap());
            return Transaction.a(mutableData);
        }
        if (podUser.getLike_num() > ((PodUser) arrayList.get(arrayList.indexOf(podUser))).getLike_num()) {
            mutableData.a(podUser.getUid()).d(podUser.toTopMap());
            return Transaction.a(mutableData);
        }
        DatabaseReference databaseReference2 = sVar.f43916a;
        if (databaseReference2 == null) {
            kotlin.jvm.internal.m.n("mUserDb");
            throw null;
        }
        Validation.a("like_num");
        if (databaseReference2.f18991d) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
        Path path = new Path("like_num");
        if (path.size() == 0) {
            throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
        }
        PathIndex pathIndex = new PathIndex(path);
        Repo repo = databaseReference2.f18988a;
        Path path2 = databaseReference2.f18989b;
        QueryParams queryParamsA = databaseReference2.f18990c.a();
        queryParamsA.f19473g = pathIndex;
        new Query(repo, path2, queryParamsA);
        if (queryParamsA.d()) {
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        new Query(repo, path2, queryParamsA.g()).b(new q(sVar));
        return Transaction.a(mutableData);
    }
}
