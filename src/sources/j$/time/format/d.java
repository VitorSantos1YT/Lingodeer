package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e[] f35048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35049b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(List list, boolean z11) {
        ArrayList arrayList = (ArrayList) list;
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z11);
    }

    public d(e[] eVarArr, boolean z11) {
        this.f35048a = eVarArr;
        this.f35049b = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.f35117c--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(j$.time.format.x r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.f35049b
            if (r2 == 0) goto Le
            int r3 = r8.f35117c
            int r3 = r3 + r1
            r8.f35117c = r3
        Le:
            j$.time.format.e[] r3 = r7.f35048a     // Catch: java.lang.Throwable -> L27
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L12:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L27
            boolean r6 = r6.w(r8, r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != 0) goto L29
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2f
        L21:
            int r9 = r8.f35117c
            int r9 = r9 - r1
            r8.f35117c = r9
            return r1
        L27:
            r9 = move-exception
            goto L30
        L29:
            int r5 = r5 + 1
            goto L12
        L2c:
            if (r2 == 0) goto L2f
            goto L21
        L2f:
            return r1
        L30:
            if (r2 == 0) goto L37
            int r0 = r8.f35117c
            int r0 = r0 - r1
            r8.f35117c = r0
        L37:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.d.w(j$.time.format.x, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        boolean z11 = this.f35049b;
        e[] eVarArr = this.f35048a;
        int i12 = 0;
        if (z11) {
            ArrayList arrayList = vVar.f35109d;
            b0 b0VarC = vVar.c();
            b0VarC.getClass();
            b0 b0Var = new b0();
            ((HashMap) b0Var.f35038a).putAll(b0VarC.f35038a);
            b0Var.f35039b = b0VarC.f35039b;
            b0Var.f35040c = b0VarC.f35040c;
            b0Var.f35041d = b0VarC.f35041d;
            arrayList.add(b0Var);
            int length = eVarArr.length;
            int iB = i11;
            while (i12 < length) {
                iB = eVarArr[i12].B(vVar, charSequence, iB);
                if (iB < 0) {
                    ArrayList arrayList2 = vVar.f35109d;
                    arrayList2.remove(arrayList2.size() - 1);
                    return i11;
                }
                i12++;
            }
            ArrayList arrayList3 = vVar.f35109d;
            arrayList3.remove(arrayList3.size() - 2);
            return iB;
        }
        int length2 = eVarArr.length;
        while (i12 < length2) {
            i11 = eVarArr[i12].B(vVar, charSequence, i11);
            if (i11 < 0) {
                return i11;
            }
            i12++;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        e[] eVarArr = this.f35048a;
        if (eVarArr != null) {
            boolean z11 = this.f35049b;
            sb2.append(z11 ? "[" : "(");
            for (e eVar : eVarArr) {
                sb2.append(eVar);
            }
            sb2.append(z11 ? "]" : ")");
        }
        return sb2.toString();
    }
}
