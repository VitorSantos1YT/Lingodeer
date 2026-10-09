package no;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.lingo.lingoskill.speak.object.PodUser;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements ValueEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f43913a;

    public q(s sVar) {
        this.f43913a = sVar;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void E(DataSnapshot dataSnapshot) {
        HashMap map = new HashMap();
        if (dataSnapshot.f18954a.f19539a.V() > 0) {
            Iterator it = dataSnapshot.a().iterator();
            while (it.hasNext()) {
                PodUser podUser = (PodUser) ((DataSnapshot) it.next()).b();
                kotlin.jvm.internal.m.c(podUser);
                map.put(podUser.getUid(), podUser.toTopMap());
            }
        }
        DatabaseReference databaseReference = this.f43913a.f43918c;
        if (databaseReference != null) {
            databaseReference.h(map);
        } else {
            kotlin.jvm.internal.m.n("mTopUserDb");
            throw null;
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void d(DatabaseError databaseError) {
        kotlin.jvm.internal.m.f(databaseError, "databaseError");
    }
}
