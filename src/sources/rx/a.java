package rx;

import dy.q;
import ef.e;
import gy.f;
import gy.i;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f50825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f50826c;

    public /* synthetic */ a(int i11) {
        this.f50824a = i11;
    }

    public final boolean a(b bVar) {
        switch (this.f50824a) {
            case 0:
                if (!this.f50825b) {
                    synchronized (this) {
                        try {
                            if (!this.f50825b) {
                                i iVar = (i) this.f50826c;
                                if (iVar == null) {
                                    iVar = new i(0);
                                    int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    iVar.f29896b = iNumberOfLeadingZeros - 1;
                                    iVar.f29898d = (int) (0.75f * iNumberOfLeadingZeros);
                                    iVar.f29899e = new Object[iNumberOfLeadingZeros];
                                    this.f50826c = iVar;
                                }
                                iVar.a(bVar);
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
                if (!this.f50825b) {
                    synchronized (this) {
                        try {
                            if (!this.f50825b) {
                                LinkedList linkedList = (LinkedList) this.f50826c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f50826c = linkedList;
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

    @Override // rx.b
    public final boolean b() {
        switch (this.f50824a) {
            case 0:
                break;
        }
        return this.f50825b;
    }

    public final boolean c(b bVar) {
        Object obj;
        switch (this.f50824a) {
            case 0:
                if (this.f50825b) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.f50825b) {
                            return false;
                        }
                        i iVar = (i) this.f50826c;
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
                if (!this.f50825b) {
                    synchronized (this) {
                        try {
                            if (!this.f50825b) {
                                LinkedList linkedList = (LinkedList) this.f50826c;
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

    public final boolean d(b bVar) {
        switch (this.f50824a) {
            case 0:
                if (!c(bVar)) {
                    return false;
                }
                bVar.dispose();
                return true;
            default:
                if (!c(bVar)) {
                    return false;
                }
                ((q) bVar).dispose();
                return true;
        }
    }

    @Override // rx.b
    public final void dispose() {
        switch (this.f50824a) {
            case 0:
                if (this.f50825b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f50825b) {
                            this.f50825b = true;
                            i iVar = (i) this.f50826c;
                            ArrayList arrayList = null;
                            this.f50826c = null;
                            if (iVar != null) {
                                for (Object obj : iVar.f29899e) {
                                    if (obj instanceof b) {
                                        try {
                                            ((b) obj).dispose();
                                        } catch (Throwable th2) {
                                            e.E(th2);
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
                                    throw f.b((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                if (this.f50825b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f50825b) {
                            this.f50825b = true;
                            LinkedList linkedList = (LinkedList) this.f50826c;
                            ArrayList arrayList2 = null;
                            this.f50826c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((b) it.next()).dispose();
                                    } catch (Throwable th4) {
                                        e.E(th4);
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
                                    throw f.b((Throwable) arrayList2.get(0));
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
