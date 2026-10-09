package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11879a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzacr f11881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableMap f11882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzqr f11883e;

    /* JADX WARN: Code duplicated, block: B:110:0x0271  */
    /* JADX WARN: Code duplicated, block: B:111:0x0274  */
    /* JADX WARN: Code duplicated, block: B:114:0x027a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0291  */
    /* JADX WARN: Code duplicated, block: B:118:0x0296  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public zzqs(zznd zzndVar, zzqr zzqrVar) {
        ImmutableMap immutableMapA;
        char c11;
        long j11;
        long j12;
        String str;
        int i11 = 1;
        zzmw zzmwVar = zzndVar.f11759a;
        zzmq zzmqVar = zzndVar.f11760b;
        if (zzmwVar.f11747a.isEmpty()) {
            zzmq.F().equals(zzmqVar);
        }
        this.f11880b = zzmqVar.y();
        this.f11881c = zzmqVar.z();
        zzmqVar.getClass();
        zzmqVar.getClass();
        Map mapD = zzmqVar.C() == 0 ? null : zzmqVar.D();
        if (mapD != null) {
            ImmutableSet.m(mapD.keySet());
        } else {
            ImmutableSet.s();
        }
        zzmw zzmwVar2 = zzndVar.f11759a;
        char c12 = 3;
        if (zzmqVar.C() > 0) {
            Collection<zzmi> collectionValues = zzmqVar.D().values();
            if (collectionValues == null) {
                immutableMapA = ImmutableMap.k();
            } else {
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                for (zzmi zzmiVar : collectionValues) {
                    int iM = zzmiVar.M();
                    int i12 = iM - 1;
                    if (iM == 0) {
                        throw null;
                    }
                    if (i12 == 0) {
                        builder.c(zzmiVar.y(), Long.valueOf(zzmiVar.z()));
                    } else if (i12 == 1) {
                        builder.c(zzmiVar.y(), Boolean.valueOf(zzmiVar.A()));
                    } else if (i12 == 2) {
                        builder.c(zzmiVar.y(), Double.valueOf(zzmiVar.B()));
                    } else if (i12 == 3) {
                        builder.c(zzmiVar.y(), zzmiVar.C());
                    } else {
                        if (i12 != 4) {
                            throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(zzmiVar.y())));
                        }
                        builder.c(zzmiVar.y(), zzmiVar.D().m());
                    }
                }
                immutableMapA = builder.a(false);
            }
            if (!immutableMapA.isEmpty()) {
                HashMap map = new HashMap(immutableMapA);
                ImmutableSortedSet immutableSortedSet = zzmwVar2.f11747a;
                ImmutableSortedSet.Builder builderH = ImmutableSortedSet.H();
                UnmodifiableIterator it = immutableSortedSet.iterator();
                while (it.hasNext()) {
                    zzmv zzmvVar = (zzmv) it.next();
                    Object obj = zzmvVar.f11741b;
                    long j13 = zzmvVar.f11740a;
                    Object objRemove = map.remove(obj == null ? Long.toString(j13) : obj);
                    if (objRemove == null) {
                        builderH.m(zzmvVar);
                    } else if (objRemove instanceof String) {
                        builderH.m(new zzmv(zzmvVar.f11740a, zzmvVar.f11741b, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        builderH.m(new zzmv(zzmvVar.f11740a, zzmvVar.f11741b, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        builderH.m(new zzmv(zzmvVar.f11740a, zzmvVar.f11741b, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        builderH.m(new zzmv(zzmvVar.f11740a, zzmvVar.f11741b, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = zzmvVar.f11741b;
                            string = string == null ? Long.toString(j13) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(e.p(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        builderH.m(new zzmv(zzmvVar.f11740a, zzmvVar.f11741b, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
                for (String str2 : map.keySet()) {
                    Object obj2 = map.get(str2);
                    int length = str2.length();
                    if (length <= 19) {
                        if (length == 0) {
                            c11 = c12;
                        } else {
                            c11 = c12;
                            long jCharAt = str2.charAt(0) - '0';
                            if (jCharAt >= 1) {
                                if (jCharAt <= 9) {
                                    int i13 = i11;
                                    while (true) {
                                        if (i13 >= length) {
                                            j11 = 0;
                                            if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                j12 = jCharAt;
                                                break;
                                            }
                                            break;
                                        }
                                        int iCharAt = str2.charAt(i13) - '0';
                                        j11 = 0;
                                        if (!((iCharAt < 0) | (iCharAt > 9))) {
                                            jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                            i13++;
                                        }
                                    }
                                }
                                if (j12 == j11) {
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                if (obj2 instanceof String) {
                                    builderH.m(new zzmv(j12, str, 4, 0L, obj2));
                                } else if (obj2 instanceof byte[]) {
                                    builderH.m(new zzmv(j12, str, 5, 0L, obj2));
                                } else if (obj2 instanceof Boolean) {
                                    builderH.m(new zzmv(j12, str, ((Boolean) obj2).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj2 instanceof Long) {
                                    builderH.m(new zzmv(j12, str, 2, ((Long) obj2).longValue(), null));
                                } else {
                                    if (obj2 instanceof Double) {
                                        String strValueOf = String.valueOf(obj2);
                                        throw new IllegalStateException(e.p(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                    }
                                    builderH.m(new zzmv(j12, str, 3, Double.doubleToRawLongBits(((Double) obj2).doubleValue()), null));
                                }
                                c12 = c11;
                                i11 = 1;
                            }
                            j12 = j11;
                            if (j12 == j11) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            if (obj2 instanceof String) {
                                builderH.m(new zzmv(j12, str, 4, 0L, obj2));
                            } else if (obj2 instanceof byte[]) {
                                builderH.m(new zzmv(j12, str, 5, 0L, obj2));
                            } else if (obj2 instanceof Boolean) {
                                builderH.m(new zzmv(j12, str, ((Boolean) obj2).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj2 instanceof Long) {
                                builderH.m(new zzmv(j12, str, 2, ((Long) obj2).longValue(), null));
                            } else {
                                if (obj2 instanceof Double) {
                                    String strValueOf2 = String.valueOf(obj2);
                                    throw new IllegalStateException(e.p(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                }
                                builderH.m(new zzmv(j12, str, 3, Double.doubleToRawLongBits(((Double) obj2).doubleValue()), null));
                            }
                            c12 = c11;
                            i11 = 1;
                        }
                        j11 = 0;
                        j12 = 0;
                        if (j12 == j11) {
                            str = str2;
                        } else {
                            str = null;
                        }
                        if (obj2 instanceof String) {
                            builderH.m(new zzmv(j12, str, 4, 0L, obj2));
                        } else if (obj2 instanceof byte[]) {
                            builderH.m(new zzmv(j12, str, 5, 0L, obj2));
                        } else if (obj2 instanceof Boolean) {
                            builderH.m(new zzmv(j12, str, ((Boolean) obj2).booleanValue() ? 1 : 0, 0L, null));
                        } else if (obj2 instanceof Long) {
                            builderH.m(new zzmv(j12, str, 2, ((Long) obj2).longValue(), null));
                        } else {
                            if (obj2 instanceof Double) {
                                String strValueOf3 = String.valueOf(obj2);
                                throw new IllegalStateException(e.p(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                            }
                            builderH.m(new zzmv(j12, str, 3, Double.doubleToRawLongBits(((Double) obj2).doubleValue()), null));
                        }
                        c12 = c11;
                        i11 = 1;
                    } else {
                        c11 = c12;
                    }
                    j11 = 0;
                    j12 = j11;
                    if (j12 == j11) {
                        str = str2;
                    } else {
                        str = null;
                    }
                    if (obj2 instanceof String) {
                        builderH.m(new zzmv(j12, str, 4, 0L, obj2));
                    } else if (obj2 instanceof byte[]) {
                        builderH.m(new zzmv(j12, str, 5, 0L, obj2));
                    } else if (obj2 instanceof Boolean) {
                        builderH.m(new zzmv(j12, str, ((Boolean) obj2).booleanValue() ? 1 : 0, 0L, null));
                    } else if (obj2 instanceof Long) {
                        builderH.m(new zzmv(j12, str, 2, ((Long) obj2).longValue(), null));
                    } else {
                        if (obj2 instanceof Double) {
                            String strValueOf4 = String.valueOf(obj2);
                            throw new IllegalStateException(e.p(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                        }
                        builderH.m(new zzmv(j12, str, 3, Double.doubleToRawLongBits(((Double) obj2).doubleValue()), null));
                    }
                    c12 = c11;
                    i11 = 1;
                }
                zzmwVar2 = new zzmw(builderH.k());
            }
        }
        ImmutableMap.Builder builderA = ImmutableMap.a(zzmwVar2.f11747a.size() + 3);
        UnmodifiableIterator it2 = zzmwVar2.f11747a.iterator();
        while (it2.hasNext()) {
            zzmv zzmvVar2 = (zzmv) it2.next();
            String string3 = zzmvVar2.f11741b;
            if (string3 == null) {
                string3 = Long.toString(zzmvVar2.f11740a);
            }
            builderA.c(string3, zzmvVar2.a());
        }
        builderA.c("__phenotype_server_token", zzmqVar.A());
        builderA.c("__phenotype_snapshot_token", zzmqVar.y());
        builderA.c("__phenotype_configuration_version", Long.valueOf(zzmqVar.B()));
        this.f11882d = builderA.a(false);
        this.f11883e = zzqrVar;
    }

    public zzqs(zzqv zzqvVar, zzqr zzqrVar) {
        zzqv.F().equals(zzqvVar);
        this.f11880b = zzqvVar.y();
        this.f11881c = zzqvVar.z();
        ImmutableSet.s();
        ImmutableMap.Builder builderA = ImmutableMap.a(zzqvVar.D() + 3);
        for (zzqx zzqxVar : zzqvVar.C()) {
            int iL = zzqxVar.L();
            int i11 = iL - 1;
            if (iL == 0) {
                throw null;
            }
            if (i11 == 0) {
                builderA.c(zzqxVar.y(), Long.valueOf(zzqxVar.z()));
            } else if (i11 == 1) {
                builderA.c(zzqxVar.y(), Boolean.valueOf(zzqxVar.A()));
            } else if (i11 == 2) {
                builderA.c(zzqxVar.y(), Double.valueOf(zzqxVar.B()));
            } else if (i11 == 3) {
                builderA.c(zzqxVar.y(), zzqxVar.C());
            } else if (i11 == 4) {
                builderA.c(zzqxVar.y(), zzqxVar.D().m());
            }
        }
        builderA.c("__phenotype_server_token", zzqvVar.A());
        builderA.c("__phenotype_snapshot_token", zzqvVar.y());
        builderA.c("__phenotype_configuration_version", Long.valueOf(zzqvVar.B()));
        this.f11882d = builderA.a(false);
        this.f11883e = zzqrVar;
    }
}
