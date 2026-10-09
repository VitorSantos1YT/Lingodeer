package ww;

import fb.g0;
import gy.i;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kx.n;
import nx.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f55492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f55493c;

    public /* synthetic */ a(int i11) {
        this.f55491a = i11;
    }

    public final boolean a(b bVar) {
        switch (this.f55491a) {
            case 0:
                if (!this.f55492b) {
                    synchronized (this) {
                        try {
                            if (!this.f55492b) {
                                i iVar = (i) this.f55493c;
                                if (iVar == null) {
                                    iVar = new i(1);
                                    int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    iVar.f29896b = iNumberOfLeadingZeros - 1;
                                    iVar.f29898d = (int) (0.75f * iNumberOfLeadingZeros);
                                    iVar.f29899e = new Object[iNumberOfLeadingZeros];
                                    this.f55493c = iVar;
                                }
                                iVar.b(bVar);
                                return true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                bVar.dispose();
                return false;
            default:
                if (!this.f55492b) {
                    synchronized (this) {
                        try {
                            if (!this.f55492b) {
                                LinkedList linkedList = (LinkedList) this.f55493c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f55493c = linkedList;
                                }
                                linkedList.add(bVar);
                                return true;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                bVar.dispose();
                return false;
        }
    }

    public final boolean b(b bVar) {
        Object obj;
        switch (this.f55491a) {
            case 0:
                ax.d.a(bVar, "disposables is null");
                if (this.f55492b) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.f55492b) {
                            return false;
                        }
                        i iVar = (i) this.f55493c;
                        if (iVar != null) {
                            Object[] objArr = iVar.f29899e;
                            int i11 = iVar.f29896b;
                            int iHashCode = bVar.hashCode() * (-1640531527);
                            int i12 = (iHashCode ^ (iHashCode >>> 16)) & i11;
                            Object obj2 = objArr[i12];
                            if (obj2 != null) {
                                if (obj2.equals(bVar)) {
                                    iVar.d(i12, i11, objArr);
                                } else {
                                    do {
                                        i12 = (i12 + 1) & i11;
                                        obj = objArr[i12];
                                        if (obj == null) {
                                        }
                                    } while (!obj.equals(bVar));
                                    iVar.d(i12, i11, objArr);
                                }
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                boolean z11 = false;
                if (!this.f55492b) {
                    synchronized (this) {
                        try {
                            if (!this.f55492b) {
                                LinkedList linkedList = (LinkedList) this.f55493c;
                                if (linkedList != null && linkedList.remove(bVar)) {
                                    z11 = true;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    break;
                }
                return z11;
        }
    }

    public final boolean c(b bVar) {
        switch (this.f55491a) {
            case 0:
                if (!b(bVar)) {
                    return false;
                }
                bVar.dispose();
                return true;
            default:
                if (!b(bVar)) {
                    return false;
                }
                ((n) bVar).dispose();
                return true;
        }
    }

    @Override // ww.b
    public final void dispose() {
        switch (this.f55491a) {
            case 0:
                if (this.f55492b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f55492b) {
                            this.f55492b = true;
                            i iVar = (i) this.f55493c;
                            ArrayList arrayList = null;
                            this.f55493c = null;
                            if (iVar != null) {
                                for (Object obj : iVar.f29899e) {
                                    if (obj instanceof b) {
                                        try {
                                            ((b) obj).dispose();
                                        } catch (Throwable th2) {
                                            g0.D(th2);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(th2);
                                        }
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new CompositeException(arrayList);
                                    }
                                    throw e.c((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                if (this.f55492b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f55492b) {
                            this.f55492b = true;
                            LinkedList linkedList = (LinkedList) this.f55493c;
                            ArrayList arrayList2 = null;
                            this.f55493c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((b) it.next()).dispose();
                                    } catch (Throwable th4) {
                                        g0.D(th4);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(th4);
                                    }
                                }
                                if (arrayList2 != null) {
                                    if (arrayList2.size() != 1) {
                                        throw new CompositeException(arrayList2);
                                    }
                                    throw e.c((Throwable) arrayList2.get(0));
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return;
        }
    }
}
