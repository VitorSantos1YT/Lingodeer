package ob;

import android.net.NetworkRequest;
import android.os.Build;
import fb.c0;
import fb.w;
import fr.j3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f44797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(w9.s sVar, int i11) {
        super(sVar);
        this.f44797d = i11;
    }

    @Override // l1.a
    public final String f() {
        switch (this.f44797d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void j(la.j jVar, Object obj) throws IOException {
        int i11;
        int i12;
        int[] iArrZ0;
        int[] iArrZ1;
        byte[] byteArray;
        byte[] byteArray2;
        int i13 = 3;
        switch (this.f44797d) {
            case 0:
                a aVar = (a) obj;
                jVar.l(1, aVar.f44795a);
                jVar.l(2, aVar.f44796b);
                return;
            case 1:
                d dVar = (d) obj;
                jVar.l(1, dVar.f44801a);
                jVar.g(2, dVar.f44802b.longValue());
                return;
            case 2:
                g gVar = (g) obj;
                jVar.l(1, gVar.f44808a);
                jVar.g(2, gVar.f44809b);
                jVar.g(3, gVar.f44810c);
                return;
            case 3:
                k kVar = (k) obj;
                jVar.l(1, kVar.f44819a);
                jVar.l(2, kVar.f44820b);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                p pVar = (p) obj;
                jVar.l(1, pVar.f44848a);
                jVar.g(2, gb.r.R(pVar.f44849b));
                jVar.l(3, pVar.f44850c);
                jVar.l(4, pVar.f44851d);
                fb.j jVar2 = pVar.f44852e;
                fb.j jVar3 = fb.j.f27095b;
                jVar.t0(j3.V(jVar2), 5);
                jVar.t0(j3.V(pVar.f44853f), 6);
                jVar.g(7, pVar.f44854g);
                jVar.g(8, pVar.f44855h);
                jVar.g(9, pVar.f44856i);
                jVar.g(10, pVar.f44858k);
                fb.a backoffPolicy = pVar.f44859l;
                kotlin.jvm.internal.m.f(backoffPolicy, "backoffPolicy");
                int i14 = v.f44894b[backoffPolicy.ordinal()];
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i11 = 1;
                }
                jVar.g(11, i11);
                jVar.g(12, pVar.m);
                jVar.g(13, pVar.f44860n);
                jVar.g(14, pVar.f44861o);
                jVar.g(15, pVar.f44862p);
                jVar.g(16, pVar.f44863q ? 1L : 0L);
                c0 policy = pVar.f44864r;
                kotlin.jvm.internal.m.f(policy, "policy");
                int i15 = v.f44896d[policy.ordinal()];
                if (i15 == 1) {
                    i12 = 0;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = 1;
                }
                jVar.g(17, i12);
                jVar.g(18, pVar.f44865s);
                jVar.g(19, pVar.f44866t);
                jVar.g(20, pVar.f44867u);
                jVar.g(21, pVar.f44868v);
                jVar.g(22, pVar.f44869w);
                String str = pVar.f44870x;
                if (str == null) {
                    jVar.s(23);
                } else {
                    jVar.l(23, str);
                }
                fb.f fVar = pVar.f44857j;
                w networkType = fVar.f27065a;
                kotlin.jvm.internal.m.f(networkType, "networkType");
                int i16 = v.f44895c[networkType.ordinal()];
                if (i16 == 1) {
                    i13 = 0;
                } else if (i16 == 2) {
                    i13 = 1;
                } else if (i16 == 3) {
                    i13 = 2;
                } else if (i16 != 4) {
                    if (i16 == 5) {
                        i13 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || networkType != w.TEMPORARILY_UNMETERED) {
                            throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                        }
                        i13 = 5;
                    }
                }
                jVar.g(24, i13);
                pb.f requestCompat = fVar.f27066b;
                kotlin.jvm.internal.m.f(requestCompat, "requestCompat");
                int i17 = Build.VERSION.SDK_INT;
                if (i17 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) requestCompat.f46737a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i17 >= 31) {
                                    iArrZ0 = pb.e.b(networkRequest);
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i18 = 0; i18 < 10; i18++) {
                                        int i19 = iArr[i18];
                                        if (pb.a.d(networkRequest, i19)) {
                                            arrayList.add(Integer.valueOf(i19));
                                        }
                                    }
                                    iArrZ0 = ry.m.Z0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrZ1 = pb.e.a(networkRequest);
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i21 = 0; i21 < 30; i21++) {
                                        int i22 = iArr2[i21];
                                        if (pb.a.c(networkRequest, i22)) {
                                            arrayList2.add(Integer.valueOf(i22));
                                        }
                                    }
                                    iArrZ1 = ry.m.Z0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrZ0.length);
                                for (int i23 : iArrZ0) {
                                    objectOutputStream.writeInt(i23);
                                }
                                objectOutputStream.writeInt(iArrZ1.length);
                                for (int i24 : iArrZ1) {
                                    objectOutputStream.writeInt(i24);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                kotlin.jvm.internal.m.e(byteArray, "outputStream.toByteArray()");
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ns.o.m(objectOutputStream, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                ns.o.m(byteArrayOutputStream, th4);
                                throw th5;
                            }
                        }
                    }
                }
                jVar.t0(byteArray, 25);
                jVar.g(26, fVar.f27067c ? 1L : 0L);
                jVar.g(27, fVar.f27068d ? 1L : 0L);
                jVar.g(28, fVar.f27069e ? 1L : 0L);
                jVar.g(29, fVar.f27070f ? 1L : 0L);
                jVar.g(30, fVar.f27071g);
                jVar.g(31, fVar.f27072h);
                Set<fb.e> triggers = fVar.f27073i;
                kotlin.jvm.internal.m.f(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(triggers.size());
                            for (fb.e eVar : triggers) {
                                objectOutputStream2.writeUTF(eVar.f27062a.toString());
                                objectOutputStream2.writeBoolean(eVar.f27063b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            kotlin.jvm.internal.m.e(byteArray2, "outputStream.toByteArray()");
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                ns.o.m(objectOutputStream2, th6);
                                throw th7;
                            }
                        }
                    } catch (Throwable th8) {
                        try {
                            throw th8;
                        } catch (Throwable th9) {
                            ns.o.m(byteArrayOutputStream2, th8);
                            throw th9;
                        }
                    }
                }
                jVar.t0(byteArray2, 32);
                return;
            default:
                t tVar = (t) obj;
                jVar.l(1, tVar.f44888a);
                jVar.l(2, tVar.f44889b);
                return;
        }
    }

    public final void m(Object obj) {
        la.j jVarA = a();
        try {
            j(jVarA, obj);
            jVarA.f39867b.executeInsert();
        } finally {
            i(jVarA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w9.s database) {
        super(database);
        this.f44797d = 1;
        kotlin.jvm.internal.m.f(database, "database");
    }
}
