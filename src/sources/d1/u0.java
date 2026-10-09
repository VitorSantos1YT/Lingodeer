package d1;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f22998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(z0 z0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f22996a = i11;
        this.f22998c = z0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22996a) {
            case 0:
                return new u0(this.f22998c, dVar, 0);
            default:
                return new u0(this.f22998c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22996a) {
            case 0:
                break;
        }
        return ((u0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x033a  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object b1Var;
        qy.b0 b0Var;
        Object hVar;
        CharSequence text;
        int i11;
        j3.h hVar2;
        switch (this.f22996a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f22997b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                z0 z0Var = this.f22998c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!j3.x0.c(z0Var.m().f44705b)) {
                        z2.c1 c1Var = z0Var.f23044h;
                        if (c1Var != null) {
                            z2.b1 b1VarA = i0.b.a(ew.a.o(z0Var.m()));
                            this.f22997b = 1;
                            ((z2.g) c1Var).a(b1VarA);
                            if (b0Var2 == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return b0Var2;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                j3.h hVarQ = ew.a.q(z0Var.m(), z0Var.m().f44704a.f35700b.length());
                j3.h hVarP = ew.a.p(z0Var.m(), z0Var.m().f44704a.f35700b.length());
                j3.e eVar = new j3.e(hVarQ);
                eVar.c(hVarP);
                j3.h hVarJ = eVar.j();
                int iF = j3.x0.f(z0Var.m().f44705b);
                o3.w wVarE = z0.e(hVarJ, j3.t.b(iF, iF));
                z0Var.f23039c.invoke(wVarE);
                z0Var.f23058w = new j3.x0(wVarE.f44705b);
                z0Var.p(s0.h0.None);
                z0Var.f23037a.f51200e = true;
                return b0Var2;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f22997b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                byte b3 = 1;
                z0 z0Var2 = this.f22998c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    z2.c1 c1Var2 = z0Var2.f23044h;
                    if (c1Var2 != null) {
                        this.f22997b = 1;
                        ClipData primaryClip = ((z2.g) c1Var2).f58538a.f58568a.getPrimaryClip();
                        b1Var = primaryClip != null ? new z2.b1(primaryClip) : null;
                        if (b1Var == aVar2) {
                            return aVar2;
                        }
                    } else {
                        b0Var = b0Var3;
                    }
                    return b0Var;
                }
                if (i13 == 1) {
                    com.bumptech.glide.e.F(obj);
                    b1Var = obj;
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    hVar = obj;
                    b0Var = b0Var3;
                }
                hVar2 = (j3.h) hVar;
                if (hVar2 != null) {
                    j3.e eVar2 = new j3.e(ew.a.q(z0Var2.m(), z0Var2.m().f44704a.f35700b.length()));
                    eVar2.c(hVar2);
                    j3.h hVarJ2 = eVar2.j();
                    j3.h hVarP2 = ew.a.p(z0Var2.m(), z0Var2.m().f44704a.f35700b.length());
                    j3.e eVar3 = new j3.e(hVarJ2);
                    eVar3.c(hVarP2);
                    j3.h hVarJ3 = eVar3.j();
                    int length = hVar2.f35700b.length() + j3.x0.f(z0Var2.m().f44705b);
                    o3.w wVarE2 = z0.e(hVarJ3, j3.t.b(length, length));
                    z0Var2.f23039c.invoke(wVarE2);
                    z0Var2.f23058w = new j3.x0(wVarE2.f44705b);
                    z0Var2.p(s0.h0.None);
                    z0Var2.f23037a.f51200e = true;
                }
                return b0Var;
                z2.b1 b1Var2 = (z2.b1) b1Var;
                if (b1Var2 != null) {
                    this.f22997b = 2;
                    ClipData clipData = b1Var2.f58509a;
                    int i14 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        b0Var = b0Var3;
                        hVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int iX = ry.l.X(annotationArr);
                        if (iX >= 0) {
                            int i15 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i15];
                                int i16 = i14;
                                if (kotlin.jvm.internal.m.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    hd.d dVar = new hd.d(annotation.getValue());
                                    Parcel parcel = (Parcel) dVar.f32187b;
                                    long jO = g2.x.f28622i;
                                    long jO2 = jO;
                                    long jP = v3.o.f53501c;
                                    long jP2 = jP;
                                    n3.s sVar = null;
                                    n3.o oVar = null;
                                    n3.p pVar = null;
                                    String string = null;
                                    u3.a aVar3 = null;
                                    u3.p pVar2 = null;
                                    u3.l lVar = null;
                                    g2.v0 v0Var = null;
                                    while (true) {
                                        if (parcel.dataAvail() > b3) {
                                            byte b11 = parcel.readByte();
                                            text = text;
                                            if (b11 == b3) {
                                                if (parcel.dataAvail() >= 8) {
                                                    jO = dVar.o();
                                                    text = text;
                                                }
                                            } else if (b11 == 2) {
                                                if (parcel.dataAvail() >= 5) {
                                                    jP = dVar.p();
                                                    b3 = 1;
                                                }
                                            } else if (b11 == 3) {
                                                if (parcel.dataAvail() >= 4) {
                                                    sVar = new n3.s(parcel.readInt());
                                                    b3 = 1;
                                                }
                                            } else if (b11 == 4) {
                                                b3 = 1;
                                                if (parcel.dataAvail() >= 1) {
                                                    byte b12 = parcel.readByte();
                                                    oVar = new n3.o((b12 != 0 && b12 == 1) ? 1 : i16);
                                                    text = text;
                                                }
                                            } else if (b11 != 5) {
                                                if (b11 == 6) {
                                                    string = parcel.readString();
                                                } else if (b11 == 7) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        jP2 = dVar.p();
                                                    }
                                                } else if (b11 == 8) {
                                                    if (parcel.dataAvail() >= 4) {
                                                        aVar3 = new u3.a(parcel.readFloat());
                                                    }
                                                } else if (b11 == 9) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        pVar2 = new u3.p(parcel.readFloat(), parcel.readFloat());
                                                    }
                                                } else if (b11 != 10) {
                                                    if (b11 != 11) {
                                                        b0Var = b0Var3;
                                                        if (b11 == 12) {
                                                            if (parcel.dataAvail() >= 20) {
                                                                b0Var3 = b0Var;
                                                                v0Var = new g2.v0(dVar.o(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                            }
                                                        }
                                                        b3 = 1;
                                                    } else if (parcel.dataAvail() >= 4) {
                                                        int i17 = parcel.readInt();
                                                        int i18 = (i17 & 2) != 0 ? 1 : i16;
                                                        int i19 = (i17 & 1) != 0 ? 1 : i16;
                                                        u3.l lVar2 = u3.l.f52753d;
                                                        int i21 = i19;
                                                        u3.l lVar3 = u3.l.f52752c;
                                                        if (i18 == 0 || i21 == 0) {
                                                            b0Var = b0Var3;
                                                            if (i18 != 0) {
                                                                lVar = lVar2;
                                                            } else {
                                                                if (i21 == 0) {
                                                                    lVar3 = u3.l.f52751b;
                                                                }
                                                                lVar = lVar3;
                                                            }
                                                        } else {
                                                            List listL = ns.o.L(lVar2, lVar3);
                                                            Integer numValueOf = Integer.valueOf(i16);
                                                            int size = listL.size();
                                                            b0Var = b0Var3;
                                                            int i22 = i16;
                                                            while (i22 < size) {
                                                                numValueOf = Integer.valueOf(((u3.l) listL.get(i22)).f52754a | numValueOf.intValue());
                                                                i22++;
                                                                listL = listL;
                                                            }
                                                            lVar = new u3.l(numValueOf.intValue());
                                                        }
                                                    }
                                                    b0Var3 = b0Var;
                                                    b3 = 1;
                                                } else if (parcel.dataAvail() >= 8) {
                                                    jO2 = dVar.o();
                                                }
                                                b3 = 1;
                                            } else if (parcel.dataAvail() >= 1) {
                                                byte b13 = parcel.readByte();
                                                if (b13 == 0) {
                                                    i11 = i16;
                                                } else if (b13 == 1) {
                                                    i11 = 65535;
                                                } else {
                                                    if (b13 == 3) {
                                                        i11 = 2;
                                                    } else {
                                                        i11 = b13 == 2 ? 1 : i16;
                                                    }
                                                    pVar = new n3.p(i11);
                                                    b3 = 1;
                                                }
                                                pVar = new n3.p(i11);
                                                b3 = 1;
                                            }
                                        } else {
                                            text = text;
                                        }
                                        b0Var = b0Var3;
                                    }
                                    arrayList.add(new j3.f(new j3.p0(jO, jP, sVar, oVar, pVar, (n3.i) null, string, jP2, aVar3, pVar2, (q3.b) null, jO2, lVar, v0Var, 49152), spanStart, spanEnd));
                                } else {
                                    text = text;
                                    b0Var = b0Var3;
                                }
                                if (i15 != iX) {
                                    i15++;
                                    i14 = i16;
                                    text = text;
                                    b0Var3 = b0Var;
                                    b3 = 1;
                                }
                            }
                        } else {
                            text = text;
                            b0Var = b0Var3;
                        }
                        hVar = new j3.h(4, text.toString(), arrayList);
                    } else {
                        hVar = new j3.h(text.toString());
                        b0Var = b0Var3;
                    }
                    if (hVar == aVar2) {
                        return aVar2;
                    }
                    hVar2 = (j3.h) hVar;
                    if (hVar2 != null) {
                        j3.e eVar4 = new j3.e(ew.a.q(z0Var2.m(), z0Var2.m().f44704a.f35700b.length()));
                        eVar4.c(hVar2);
                        j3.h hVarJ4 = eVar4.j();
                        j3.h hVarP3 = ew.a.p(z0Var2.m(), z0Var2.m().f44704a.f35700b.length());
                        j3.e eVar5 = new j3.e(hVarJ4);
                        eVar5.c(hVarP3);
                        j3.h hVarJ5 = eVar5.j();
                        int length2 = hVar2.f35700b.length() + j3.x0.f(z0Var2.m().f44705b);
                        o3.w wVarE3 = z0.e(hVarJ5, j3.t.b(length2, length2));
                        z0Var2.f23039c.invoke(wVarE3);
                        z0Var2.f23058w = new j3.x0(wVarE3.f44705b);
                        z0Var2.p(s0.h0.None);
                        z0Var2.f23037a.f51200e = true;
                    }
                } else {
                    b0Var = b0Var3;
                }
                return b0Var;
        }
    }
}
