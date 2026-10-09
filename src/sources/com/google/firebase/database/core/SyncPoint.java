package com.google.firebase.database.core;

import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.persistence.NoopPersistenceManager;
import com.google.firebase.database.core.persistence.PersistenceManager;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.core.view.View;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SyncPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19294a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PersistenceManager f19295b;

    public SyncPoint(NoopPersistenceManager noopPersistenceManager) {
        this.f19295b = noopPersistenceManager;
    }

    public final List a(Operation operation, WriteTreeRef writeTreeRef, Node node) {
        QueryParams queryParams = operation.f19390b.f19395b;
        HashMap map = this.f19294a;
        if (queryParams != null) {
            View view = (View) map.get(queryParams);
            char[] cArr = Utilities.f19432a;
            return b(view, operation, writeTreeRef, node);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((View) ((Map.Entry) it.next()).getValue(), operation, writeTreeRef, node));
        }
        return arrayList;
    }

    public final List b(View view, Operation operation, WriteTreeRef writeTreeRef, Node node) {
        View.OperationResult operationResultA = view.a(operation, writeTreeRef, node);
        QuerySpec querySpec = view.f19478a;
        if (!querySpec.f19477b.h()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = operationResultA.f19484b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Change change = (Change) obj;
                Event.EventType eventType = change.f19450a;
                ChildKey childKey = change.f19453d;
                if (eventType == Event.EventType.CHILD_ADDED) {
                    hashSet2.add(childKey);
                } else if (eventType == Event.EventType.CHILD_REMOVED) {
                    hashSet.add(childKey);
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f19295b.a(querySpec, hashSet2, hashSet);
            }
        }
        return operationResultA.f19483a;
    }

    public final Node c(Path path) {
        Node nodeI;
        Iterator it = this.f19294a.values().iterator();
        do {
            nodeI = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            Node nodeB = view.f19480c.b();
            if (nodeB != null && (view.f19478a.f19477b.h() || (!path.isEmpty() && !nodeB.x0(path.k()).isEmpty()))) {
                nodeI = nodeB.I(path);
            }
        } while (nodeI == null);
        return nodeI;
    }

    public final View d() {
        Iterator it = this.f19294a.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            if (view.f19478a.f19477b.h()) {
                return view;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f19294a.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            if (!view.f19478a.f19477b.h()) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return d() != null;
    }

    public final View g(QuerySpec querySpec) {
        return querySpec.f19477b.h() ? d() : (View) this.f19294a.get(querySpec.f19477b);
    }
}
