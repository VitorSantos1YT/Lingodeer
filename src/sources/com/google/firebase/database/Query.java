package com.google.firebase.database;

import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.ValueEventRegistration;
import com.google.firebase.database.core.ZombieEventManager;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Query {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Repo f18988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QueryParams f18990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18991d;

    /* JADX INFO: renamed from: com.google.firebase.database.Query$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public Query(Repo repo, Path path, QueryParams queryParams) {
        this.f18988a = repo;
        this.f18989b = path;
        this.f18990c = queryParams;
        this.f18991d = true;
        if (queryParams.e() && queryParams.c() && queryParams.d()) {
            queryParams.d();
        }
        char[] cArr = Utilities.f19432a;
    }

    public final void a(final EventRegistration eventRegistration) {
        ZombieEventManager zombieEventManager = ZombieEventManager.f19379b;
        synchronized (zombieEventManager.f19380a) {
            try {
                List arrayList = (List) zombieEventManager.f19380a.get(eventRegistration);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    zombieEventManager.f19380a.put(eventRegistration, arrayList);
                }
                arrayList.add(eventRegistration);
                if (!eventRegistration.e().b()) {
                    EventRegistration eventRegistrationA = eventRegistration.a(QuerySpec.a(eventRegistration.e().f19476a));
                    List arrayList2 = (List) zombieEventManager.f19380a.get(eventRegistrationA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        zombieEventManager.f19380a.put(eventRegistrationA, arrayList2);
                    }
                    arrayList2.add(eventRegistration);
                }
                eventRegistration.f19209c = true;
                eventRegistration.f19207a.get();
                char[] cArr = Utilities.f19432a;
                eventRegistration.f19208b = zombieEventManager;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18988a.v(new Runnable() { // from class: com.google.firebase.database.Query.3
            @Override // java.lang.Runnable
            public final void run() {
                Query.this.f18988a.l(eventRegistration);
            }
        });
    }

    public final void b(final ValueEventListener valueEventListener) {
        a(new ValueEventRegistration(this.f18988a, new ValueEventListener() { // from class: com.google.firebase.database.Query.1
            @Override // com.google.firebase.database.ValueEventListener
            public final void E(DataSnapshot dataSnapshot) {
                Query.this.d(this);
                valueEventListener.E(dataSnapshot);
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void d(DatabaseError databaseError) {
                valueEventListener.d(databaseError);
            }
        }, c()));
    }

    public final QuerySpec c() {
        return new QuerySpec(this.f18989b, this.f18990c);
    }

    public final void d(ValueEventListener valueEventListener) {
        if (valueEventListener == null) {
            throw new NullPointerException("listener must not be null");
        }
        final ValueEventRegistration valueEventRegistration = new ValueEventRegistration(this.f18988a, valueEventListener, c());
        ZombieEventManager zombieEventManager = ZombieEventManager.f19379b;
        synchronized (zombieEventManager.f19380a) {
            try {
                List list = (List) zombieEventManager.f19380a.get(valueEventRegistration);
                if (list != null && !list.isEmpty()) {
                    if (valueEventRegistration.e().b()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            EventRegistration eventRegistration = (EventRegistration) list.get(size);
                            if (!hashSet.contains(eventRegistration.e())) {
                                hashSet.add(eventRegistration.e());
                                eventRegistration.h();
                            }
                        }
                    } else {
                        ((EventRegistration) list.get(0)).h();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18988a.v(new Runnable() { // from class: com.google.firebase.database.Query.2
            @Override // java.lang.Runnable
            public final void run() {
                Query.this.f18988a.t(valueEventRegistration);
            }
        });
    }

    public Query(Repo repo, Path path) {
        this.f18988a = repo;
        this.f18989b = path;
        this.f18990c = QueryParams.f19466i;
        this.f18991d = false;
    }
}
