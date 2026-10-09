package b1;

import android.os.CancellationSignal;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import au.d1;
import d1.z0;
import g2.f0;
import j3.t0;
import j3.u0;
import j3.x0;
import s0.h0;
import s0.o1;
import s0.s0;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final void a(CursorAnchorInfo.Builder builder, u0 u0Var, f2.c cVar) {
        if (cVar.f()) {
            return;
        }
        float f5 = cVar.f26573b;
        j3.x xVar = u0Var.f35798b;
        int iE = xVar.e(f5);
        int iE2 = xVar.e(cVar.f26575d);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(u0Var.e(iE), xVar.f(iE), u0Var.f(iE), xVar.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }

    public static int b(HandwritingGesture handwritingGesture, a00.c cVar) throws Exception {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.invoke(new o3.a(fallbackText, 1));
        return 5;
    }

    public static void c(long j11, j3.h hVar, boolean z11, a00.c cVar) throws Exception {
        if (z11) {
            int i11 = x0.f35822c;
            int iCharCount = (int) (j11 >> 32);
            int iCharCount2 = (int) (j11 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(hVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < hVar.f35700b.length() ? Character.codePointAt(hVar, iCharCount2) : 10;
            if (s.k(iCodePointBefore) && (s.j(iCodePointAt) || s.i(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(hVar, iCharCount);
                    }
                } while (s.k(iCodePointBefore));
                j11 = j3.t.b(iCharCount, iCharCount2);
            } else if (s.k(iCodePointAt) && (s.j(iCodePointBefore) || s.i(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == hVar.f35700b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(hVar, iCharCount2);
                    }
                } while (s.k(iCodePointAt));
                j11 = j3.t.b(iCharCount, iCharCount2);
            }
        }
        int i12 = (int) (4294967295L & j11);
        cVar.invoke(new o(new o3.g[]{new o3.v(i12, i12), new o3.e(x0.d(j11), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0263  */
    public static int d(s0 s0Var, HandwritingGesture handwritingGesture, z0 z0Var, p2 p2Var, a00.c cVar) throws Exception {
        long jH;
        int i11;
        o1 o1VarD;
        o1 o1VarD2;
        t0 t0Var;
        j3.h hVar = s0Var.f51175j;
        if (hVar == null) {
            return 3;
        }
        o1 o1VarD3 = s0Var.d();
        if (!hVar.equals((o1VarD3 == null || (t0Var = o1VarD3.f51124a.f35797a) == null) ? null : t0Var.f35784a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jH2 = s.h(s0Var, f0.G(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (x0.c(jH2)) {
                return b(selectGesture, cVar);
            }
            cVar.invoke(new o3.v((int) (jH2 >> 32), (int) (jH2 & 4294967295L)));
            if (z0Var != null) {
                z0Var.h(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i12 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jH3 = s.h(s0Var, f0.G(deleteGesture.getDeletionArea()), i12);
                if (x0.c(jH3)) {
                    return b(deleteGesture, cVar);
                }
                c(jH3, hVar, i12 == 1, cVar);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i13 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jB = s.b(s0Var, f0.G(deleteRangeGesture.getDeletionStartArea()), f0.G(deleteRangeGesture.getDeletionEndArea()), i13);
                    if (x0.c(jB)) {
                        return b(deleteRangeGesture, cVar);
                    }
                    c(jB, hVar, i13 == 1, cVar);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (p2Var == null) {
                        return b(joinOrSplitGesture, cVar);
                    }
                    int iA = s.a(s0Var, s.e(joinOrSplitGesture.getJoinOrSplitPoint()), p2Var);
                    if (iA == -1 || ((o1VarD2 = s0Var.d()) != null && s.c(o1VarD2.f51124a, iA))) {
                        return b(joinOrSplitGesture, cVar);
                    }
                    int iCharCount = iA;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(hVar, iCharCount);
                        if (!s.j(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iA < hVar.f35700b.length()) {
                        int iCodePointAt = Character.codePointAt(hVar, iA);
                        if (!s.j(iCodePointAt)) {
                            break;
                        }
                        iA += Character.charCount(iCodePointAt);
                    }
                    long jB2 = j3.t.b(iCharCount, iA);
                    if (!x0.c(jB2)) {
                        c(jB2, hVar, false, cVar);
                        return 1;
                    }
                    int i14 = (int) (jB2 >> 32);
                    cVar.invoke(new o(new o3.g[]{new o3.v(i14, i14), new o3.a(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (p2Var == null) {
                        return b(insertGesture, cVar);
                    }
                    int iA2 = s.a(s0Var, s.e(insertGesture.getInsertionPoint()), p2Var);
                    if (iA2 == -1 || ((o1VarD = s0Var.d()) != null && s.c(o1VarD.f51124a, iA2))) {
                        return b(insertGesture, cVar);
                    }
                    cVar.invoke(new o(new o3.g[]{new o3.v(iA2, iA2), new o3.a(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                o1 o1VarD4 = s0Var.d();
                u0 u0Var = o1VarD4 != null ? o1VarD4.f51124a : null;
                long jE = s.e(removeSpaceGesture.getStartPoint());
                long jE2 = s.e(removeSpaceGesture.getEndPoint());
                w2.x xVarC = s0Var.c();
                if (u0Var != null) {
                    j3.x xVar = u0Var.f35798b;
                    if (xVarC == null) {
                        jH = x0.f35821b;
                    } else {
                        long jM = xVarC.M(jE);
                        long jM2 = xVarC.M(jE2);
                        int iG = s.g(xVar, jM, p2Var);
                        int iG2 = s.g(xVar, jM2, p2Var);
                        if (iG != -1) {
                            if (iG2 != -1) {
                                iG = Math.min(iG, iG2);
                            }
                            iG2 = iG;
                        } else if (iG2 == -1) {
                            jH = x0.f35821b;
                        }
                        float fB = (xVar.b(iG2) + xVar.f(iG2)) / 2;
                        int i15 = (int) (jM >> 32);
                        int i16 = (int) (jM2 >> 32);
                        jH = xVar.h(new f2.c(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fB - 0.1f, Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), fB + 0.1f), 0, j3.s0.f35776a);
                    }
                } else {
                    jH = x0.f35821b;
                }
                if (x0.c(jH)) {
                    return b(removeSpaceGesture, cVar);
                }
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                wVar.f38359a = -1;
                kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                wVar2.f38359a = -1;
                String strH = new oz.o("\\s+").h(hVar.subSequence(x0.f(jH), x0.e(jH)).f35700b, new d1(11, wVar, wVar2));
                int i17 = wVar.f38359a;
                if (i17 == -1 || (i11 = wVar2.f38359a) == -1) {
                    return b(removeSpaceGesture, cVar);
                }
                int i18 = (int) (jH >> 32);
                String strSubstring = strH.substring(i17, strH.length() - (x0.d(jH) - wVar2.f38359a));
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                cVar.invoke(new o(new o3.g[]{new o3.v(i18 + i17, i18 + i11), new o3.a(strSubstring, 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jB3 = s.b(s0Var, f0.G(selectRangeGesture.getSelectionStartArea()), f0.G(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (x0.c(jB3)) {
                return b(selectRangeGesture, cVar);
            }
            cVar.invoke(new o3.v((int) (jB3 >> 32), (int) (jB3 & 4294967295L)));
            if (z0Var != null) {
                z0Var.h(true);
            }
        }
        return 1;
    }

    public static boolean e(s0 s0Var, PreviewableHandwritingGesture previewableHandwritingGesture, z0 z0Var, CancellationSignal cancellationSignal) {
        t0 t0Var;
        j3.h hVar = s0Var.f51175j;
        if (hVar != null) {
            o1 o1VarD = s0Var.d();
            if (hVar.equals((o1VarD == null || (t0Var = o1VarD.f51124a.f35797a) == null) ? null : t0Var.f35784a)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (z0Var != null) {
                        long jH = s.h(s0Var, f0.G(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        s0 s0Var2 = z0Var.f23040d;
                        if (s0Var2 != null) {
                            s0Var2.f(jH);
                        }
                        s0 s0Var3 = z0Var.f23040d;
                        if (s0Var3 != null) {
                            s0Var3.e(x0.f35821b);
                        }
                        if (!x0.c(jH)) {
                            z0Var.s(false);
                            z0Var.p(h0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (z0Var != null) {
                        long jH2 = s.h(s0Var, f0.G(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        s0 s0Var4 = z0Var.f23040d;
                        if (s0Var4 != null) {
                            s0Var4.e(jH2);
                        }
                        s0 s0Var5 = z0Var.f23040d;
                        if (s0Var5 != null) {
                            s0Var5.f(x0.f35821b);
                        }
                        if (!x0.c(jH2)) {
                            z0Var.s(false);
                            z0Var.p(h0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (z0Var != null) {
                        long jB = s.b(s0Var, f0.G(selectRangeGesture.getSelectionStartArea()), f0.G(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        s0 s0Var6 = z0Var.f23040d;
                        if (s0Var6 != null) {
                            s0Var6.f(jB);
                        }
                        s0 s0Var7 = z0Var.f23040d;
                        if (s0Var7 != null) {
                            s0Var7.e(x0.f35821b);
                        }
                        if (!x0.c(jB)) {
                            z0Var.s(false);
                            z0Var.p(h0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (z0Var != null) {
                        long jB2 = s.b(s0Var, f0.G(deleteRangeGesture.getDeletionStartArea()), f0.G(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        s0 s0Var8 = z0Var.f23040d;
                        if (s0Var8 != null) {
                            s0Var8.e(jB2);
                        }
                        s0 s0Var9 = z0Var.f23040d;
                        if (s0Var9 != null) {
                            s0Var9.f(x0.f35821b);
                        }
                        if (!x0.c(jB2)) {
                            z0Var.s(false);
                            z0Var.p(h0.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new n(z0Var, 0));
                }
                return true;
            }
        }
        return false;
    }

    public static void f(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(ns.o.L(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(ry.l.m0(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }
}
