package com.google.firebase.database.core;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.snapshot.ChildKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChildEventRegistration extends EventRegistration {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Repo f19180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ChildEventListener f19181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final QuerySpec f19182f;

    /* JADX INFO: renamed from: com.google.firebase.database.core.ChildEventRegistration$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19183a;

        static {
            int[] iArr = new int[Event.EventType.values().length];
            f19183a = iArr;
            try {
                iArr[Event.EventType.CHILD_ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19183a[Event.EventType.CHILD_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19183a[Event.EventType.CHILD_MOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19183a[Event.EventType.CHILD_REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ChildEventRegistration(Repo repo, ChildEventListener childEventListener, QuerySpec querySpec) {
        this.f19180d = repo;
        this.f19181e = childEventListener;
        this.f19182f = querySpec;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final EventRegistration a(QuerySpec querySpec) {
        return new ChildEventRegistration(this.f19180d, this.f19181e, querySpec);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final DataEvent b(Change change, QuerySpec querySpec) {
        DataSnapshot dataSnapshot = new DataSnapshot(new DatabaseReference(this.f19180d, querySpec.f19476a.f(change.f19453d)), change.f19451b);
        ChildKey childKey = change.f19454e;
        return new DataEvent(change.f19450a, this, dataSnapshot, childKey != null ? childKey.f19513a : null);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final void c(DatabaseError databaseError) {
        this.f19181e.d(databaseError);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final void d(DataEvent dataEvent) {
        if (this.f19207a.get()) {
            return;
        }
        int[] iArr = AnonymousClass1.f19183a;
        Event.EventType eventType = dataEvent.f19455a;
        String str = dataEvent.f19458d;
        DataSnapshot dataSnapshot = dataEvent.f19457c;
        int i11 = iArr[eventType.ordinal()];
        ChildEventListener childEventListener = this.f19181e;
        if (i11 == 1) {
            childEventListener.f(dataSnapshot, str);
            return;
        }
        if (i11 == 2) {
            childEventListener.e(dataSnapshot, str);
        } else if (i11 == 3) {
            childEventListener.g(dataSnapshot, str);
        } else {
            if (i11 != 4) {
                return;
            }
            childEventListener.h(dataSnapshot);
        }
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final QuerySpec e() {
        return this.f19182f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChildEventRegistration)) {
            return false;
        }
        ChildEventRegistration childEventRegistration = (ChildEventRegistration) obj;
        return childEventRegistration.f19181e.equals(this.f19181e) && childEventRegistration.f19180d.equals(this.f19180d) && childEventRegistration.f19182f.equals(this.f19182f);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final boolean f(EventRegistration eventRegistration) {
        return (eventRegistration instanceof ChildEventRegistration) && ((ChildEventRegistration) eventRegistration).f19181e.equals(this.f19181e);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public final boolean g(Event.EventType eventType) {
        return eventType != Event.EventType.VALUE;
    }

    public final int hashCode() {
        return this.f19182f.hashCode() + ((this.f19180d.hashCode() + (this.f19181e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChildEventRegistration";
    }
}
