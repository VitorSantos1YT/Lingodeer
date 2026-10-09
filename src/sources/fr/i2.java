package fr;

import com.lingodeer.network.model.ApiResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3 f27599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(int i11, i3 i3Var, vy.d dVar) {
        super(2, dVar);
        this.f27596a = i11;
        this.f27599d = i3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27596a) {
            case 0:
                i2 i2Var = new i2(0, this.f27599d, dVar);
                i2Var.f27598c = obj;
                return i2Var;
            case 1:
                i2 i2Var2 = new i2(1, this.f27599d, dVar);
                i2Var2.f27598c = obj;
                return i2Var2;
            case 2:
                i2 i2Var3 = new i2(2, this.f27599d, dVar);
                i2Var3.f27598c = obj;
                return i2Var3;
            case 3:
                i2 i2Var4 = new i2(3, this.f27599d, dVar);
                i2Var4.f27598c = obj;
                return i2Var4;
            default:
                i2 i2Var5 = new i2(4, this.f27599d, dVar);
                i2Var5.f27598c = obj;
                return i2Var5;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27596a) {
            case 0:
                return ((i2) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((i2) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((i2) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((i2) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((i2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022e  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x021d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0221  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        ApiResponse apiResponse;
        Boolean bool;
        Boolean bool2;
        switch (this.f27596a) {
            case 0:
                uz.j jVar = (uz.j) this.f27598c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27597b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            com.bumptech.glide.e.F(obj);
                            apiResponse = (ApiResponse) obj;
                            if (apiResponse instanceof ApiResponse.Error) {
                                bool2 = Boolean.FALSE;
                                this.f27598c = null;
                                this.f27597b = 3;
                                if (jVar.emit(bool2, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (apiResponse instanceof ApiResponse.Success) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bool = Boolean.TRUE;
                                this.f27598c = null;
                                this.f27597b = 4;
                                if (jVar.emit(bool, this) == aVar) {
                                    return aVar;
                                }
                            }
                        } else if (i11 != 3 && i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    com.bumptech.glide.e.F(obj);
                } else {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var = this.f27599d;
                    if (((Boolean) i3Var.m.f55231b.f53391a.getValue()).booleanValue()) {
                        dv.u0 u0Var = i3Var.f27611l;
                        String strW = ((o0) i3Var.f27600a).w();
                        List listK = ns.o.K("all");
                        List listK2 = ns.o.K("all");
                        this.f27598c = jVar;
                        this.f27597b = 2;
                        obj = u0Var.z(strW, listK, listK2, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        apiResponse = (ApiResponse) obj;
                        if (apiResponse instanceof ApiResponse.Error) {
                            bool2 = Boolean.FALSE;
                            this.f27598c = null;
                            this.f27597b = 3;
                            if (jVar.emit(bool2, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (apiResponse instanceof ApiResponse.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bool = Boolean.TRUE;
                            this.f27598c = null;
                            this.f27597b = 4;
                            if (jVar.emit(bool, this) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        Boolean bool3 = Boolean.FALSE;
                        this.f27598c = null;
                        this.f27597b = 1;
                        if (jVar.emit(bool3, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return b0Var;
            case 1:
                uz.j jVar2 = (uz.j) this.f27598c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27597b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                i3 i3Var2 = this.f27599d;
                j2 j2Var = new j2(i3Var2, null);
                this.f27598c = jVar2;
                this.f27597b = 1;
                obj = i3Var2.k(j2Var, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f27598c = null;
                this.f27597b = 2;
                if (jVar2.emit(bool4, this) == aVar2) {
                    return aVar2;
                }
                return qy.b0.f48488a;
            case 2:
                uz.j jVar3 = (uz.j) this.f27598c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27597b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                i3 i3Var3 = this.f27599d;
                k2 k2Var = new k2(i3Var3, null);
                this.f27598c = jVar3;
                this.f27597b = 1;
                obj = i3Var3.k(k2Var, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                this.f27598c = null;
                this.f27597b = 2;
                if (jVar3.emit(bool5, this) == aVar3) {
                    return aVar3;
                }
                return qy.b0.f48488a;
            case 3:
                uz.j jVar4 = (uz.j) this.f27598c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f27597b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                i3 i3Var4 = this.f27599d;
                l2 l2Var = new l2(i3Var4, null);
                this.f27598c = jVar4;
                this.f27597b = 1;
                obj = i3Var4.k(l2Var, this);
                if (obj == aVar4) {
                    return aVar4;
                }
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                this.f27598c = null;
                this.f27597b = 2;
                if (jVar4.emit(bool6, this) == aVar4) {
                    return aVar4;
                }
                return qy.b0.f48488a;
            default:
                rz.b0 b0Var2 = (rz.b0) this.f27598c;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f27597b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ArrayList arrayList = new ArrayList(34);
                    int i16 = 0;
                    while (true) {
                        vy.d dVar = null;
                        if (i16 < 34) {
                            int i17 = xt.d.f56292a[i16];
                            ArrayList arrayList2 = new ArrayList();
                            i3 i3Var5 = this.f27599d;
                            arrayList2.add(rz.e0.f(b0Var2, null, null, new s2(i17, i3Var5, dVar, 0), 3));
                            arrayList2.add(rz.e0.f(b0Var2, null, null, new s2(i17, i3Var5, dVar, 1), 3));
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i17)) || ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i17))) {
                                arrayList2.add(rz.e0.f(b0Var2, null, null, new s2(i17, i3Var5, dVar, 2), 3));
                            }
                            arrayList2.add(rz.e0.f(b0Var2, null, null, new s2(i17, i3Var5, dVar, 3), 3));
                            arrayList.add(arrayList2);
                            i16++;
                        } else {
                            ArrayList arrayListX = ry.n.X(arrayList);
                            this.f27598c = null;
                            this.f27597b = 1;
                            obj = rz.e0.g(arrayListX, this);
                            if (obj == aVar5) {
                                return aVar5;
                            }
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return Boolean.valueOf(!((List) obj).contains(Boolean.FALSE));
        }
    }
}
