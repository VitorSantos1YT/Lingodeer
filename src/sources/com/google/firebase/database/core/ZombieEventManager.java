package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ZombieEventManager implements EventRegistrationZombieListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ZombieEventManager f19379b = new ZombieEventManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19380a = new HashMap();

    private ZombieEventManager() {
    }

    @Override // com.google.firebase.database.core.EventRegistrationZombieListener
    public final void a(EventRegistration eventRegistration) {
        synchronized (this.f19380a) {
            try {
                List list = (List) this.f19380a.get(eventRegistration);
                int i11 = 0;
                if (list != null) {
                    while (true) {
                        if (i11 >= list.size()) {
                            i11 = 0;
                            break;
                        } else {
                            if (list.get(i11) == eventRegistration) {
                                list.remove(i11);
                                i11 = 1;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (list.isEmpty()) {
                        this.f19380a.remove(eventRegistration);
                    }
                }
                if (i11 == 0) {
                    boolean z11 = eventRegistration.f19209c;
                }
                char[] cArr = Utilities.f19432a;
                if (!eventRegistration.e().b()) {
                    EventRegistration eventRegistrationA = eventRegistration.a(QuerySpec.a(eventRegistration.e().f19476a));
                    List list2 = (List) this.f19380a.get(eventRegistrationA);
                    if (list2 != null) {
                        for (int i12 = 0; i12 < list2.size(); i12++) {
                            if (list2.get(i12) == eventRegistration) {
                                list2.remove(i12);
                                break;
                            }
                        }
                        if (list2.isEmpty()) {
                            this.f19380a.remove(eventRegistrationA);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
