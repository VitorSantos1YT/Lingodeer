package re;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.google.common.collect.ImmutableList;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Objects;
import lf.i1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class e0 implements i1, td.h, u9.c, aw.q, tx.a, tx.c, av.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e0 f49139b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49140a;

    public /* synthetic */ e0(int i11) {
        this.f49140a = i11;
    }

    public static byte[] d(ImmutableList immutableList, long j11) {
        a7.c cVar = new a7.c(12);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = immutableList.get(i11);
            i11++;
            arrayList.add((Bundle) cVar.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static String h(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // tx.c
    public void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        Objects.requireNonNull(th2, "error is null");
        Object obj2 = new qx.f(new gy.g(th2)).f48468a;
        Throwable th3 = obj2 instanceof gy.g ? ((gy.g) obj2).f29894a : null;
        if (th3 != null) {
            th3.printStackTrace();
        }
    }

    @Override // lf.i1
    public void b(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
        if (strOptString == null) {
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        k.f49183f.n().a(new f0(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    @Override // lf.i1
    public void c(FacebookException facebookException) {
        Objects.toString(facebookException);
    }

    @Override // u9.c
    public void e(int i11, Object obj) {
        if (i11 == 6 || i11 == 7 || i11 == 8) {
        }
    }

    public boolean g(CharSequence charSequence) {
        return false;
    }

    public boolean i(ArrayList arrayList, aw.p pVar) {
        boolean z11;
        if (arrayList.size() > 1 && pVar.k() == -3) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                uv.b bVar = (uv.b) obj;
                synchronized (bVar.f53194p) {
                    try {
                        uv.c cVar = bVar.f53181b;
                        uv.b bVar2 = cVar.f53198c;
                        if (bVar2.f53180a.f53199d != 0 && bVar2.f53180a.f53199d != 3) {
                        }
                        cVar.f(pVar);
                        o00.a.p(this, "updateMoreLikelyCompleted", new Object[0]);
                        return true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                if (-4 == pVar.k()) {
                    int size3 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        uv.b bVar3 = (uv.b) obj2;
                        synchronized (bVar3.f53194p) {
                            uv.b bVar4 = bVar3.f53181b.f53198c;
                        }
                    }
                }
                if (arrayList.size() != 1) {
                    return false;
                }
                uv.b bVar5 = (uv.b) arrayList.get(0);
                synchronized (bVar5.f53194p) {
                    o00.a.p(this, "updateKeepAhead", new Object[0]);
                    uv.c cVar2 = bVar5.f53181b;
                    byte b3 = cVar2.f53199d;
                    byte bK = pVar.k();
                    if ((b3 == 3 || b3 == 5 || b3 != bK) && b3 >= 0 && (b3 < 1 || b3 > 6 || bK < 10 || bK > 11)) {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != 5) {
                                        if (b3 != 6 || (bK != 0 && bK != 1)) {
                                            cVar2.f(pVar);
                                            z11 = true;
                                        }
                                    } else if (bK != 1 && bK != 6) {
                                        cVar2.f(pVar);
                                        z11 = true;
                                    }
                                } else if (bK != 0 && bK != 1 && bK != 2 && bK != 6) {
                                    cVar2.f(pVar);
                                    z11 = true;
                                }
                            } else if (bK != 0 && bK != 1 && bK != 6) {
                                cVar2.f(pVar);
                                z11 = true;
                            }
                        } else if (bK != 0) {
                            cVar2.f(pVar);
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                return z11;
            }
            Object obj3 = arrayList.get(i12);
            i12++;
            uv.b bVar6 = (uv.b) obj3;
            synchronized (bVar6.f53194p) {
                try {
                    uv.c cVar3 = bVar6.f53181b;
                    byte b11 = cVar3.f53199d;
                    byte bK2 = pVar.k();
                    if (-2 == b11 && bK2 > 0) {
                        break;
                    }
                    if ((b11 == 3 || b11 == 5 || b11 != bK2) && b11 >= 0) {
                        if (bK2 != -2 && bK2 != -1) {
                            if (b11 != 0) {
                                if (b11 != 1) {
                                    if (b11 == 2 || b11 == 3) {
                                        if (bK2 == -3 || bK2 == 3 || bK2 == 5) {
                                        }
                                    } else if (b11 == 5 || b11 == 6) {
                                        if (bK2 == 2 || bK2 == 5) {
                                        }
                                    } else if (b11 != 10) {
                                        if (b11 == 11 && (bK2 == -4 || bK2 == -3 || bK2 == 1)) {
                                        }
                                    } else if (bK2 != 11) {
                                    }
                                } else if (bK2 != 6) {
                                }
                            } else if (bK2 == 10) {
                            }
                        }
                        cVar3.f(pVar);
                        break;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        o00.a.p(this, "updateKeepFlow", new Object[0]);
        return true;
    }

    @Override // aw.q
    public void j(aw.p pVar) {
        synchronized (Integer.toString(pVar.f3237a).intern()) {
            try {
                ArrayList arrayListF = uv.f.f53206a.f(pVar.f3237a);
                if (arrayListF.size() > 0) {
                    ((uv.b) arrayListF.get(0)).getClass();
                    if (!i(arrayListF, pVar)) {
                        StringBuilder sb2 = new StringBuilder("The event isn't consumed, id:" + pVar.f3237a + " status:" + ((int) pVar.k()) + " task-count:" + arrayListF.size());
                        int size = arrayListF.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayListF.get(i11);
                            i11++;
                            uv.b bVar = (uv.b) obj;
                            sb2.append(" | ");
                            bVar.getClass();
                            sb2.append((int) bVar.f53180a.f53199d);
                        }
                        o00.a.B(4, this, null, sb2.toString(), new Object[0]);
                    }
                } else {
                    o00.a.B(4, this, null, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(pVar.k()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f49140a) {
            case 8:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // av.l
    public void a() {
    }

    @Override // tx.a
    public void run() {
    }

    @Override // td.h
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
