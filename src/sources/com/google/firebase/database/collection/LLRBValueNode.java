package com.google.firebase.database.collection;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LLRBNode f19038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LLRBNode f19039d;

    public LLRBValueNode(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        this.f19036a = obj;
        this.f19037b = obj2;
        this.f19038c = lLRBNode == null ? LLRBEmptyNode.f19035a : lLRBNode;
        this.f19039d = lLRBNode2 == null ? LLRBEmptyNode.f19035a : lLRBNode2;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode a() {
        return this.f19038c;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode b(Object obj, Object obj2, Comparator comparator) {
        LLRBValueNode lLRBValueNodeL;
        int iCompare = comparator.compare(obj, this.f19036a);
        if (iCompare < 0) {
            lLRBValueNodeL = l(null, null, this.f19038c.b(obj, obj2, comparator), null);
        } else {
            lLRBValueNodeL = iCompare == 0 ? l(obj, obj2, null, null) : l(null, null, null, this.f19039d.b(obj, obj2, comparator));
        }
        return lLRBValueNodeL.m();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode d(Object obj, Comparator comparator) {
        LLRBValueNode lLRBValueNodeL;
        if (comparator.compare(obj, this.f19036a) < 0) {
            LLRBValueNode<K, V> lLRBValueNodeO = (this.f19038c.isEmpty() || this.f19038c.f() || ((LLRBValueNode) this.f19038c).f19038c.f()) ? this : o();
            lLRBValueNodeL = lLRBValueNodeO.l(null, null, lLRBValueNodeO.f19038c.d(obj, comparator), null);
        } else {
            LLRBValueNode lLRBValueNodeQ = this.f19038c.f() ? q() : this;
            LLRBNode lLRBNode = lLRBValueNodeQ.f19039d;
            if (!lLRBNode.isEmpty() && !lLRBNode.f() && !((LLRBValueNode) lLRBNode).f19038c.f()) {
                lLRBValueNodeQ = lLRBValueNodeQ.j();
                if (lLRBValueNodeQ.f19038c.a().f()) {
                    lLRBValueNodeQ = lLRBValueNodeQ.q().j();
                }
            }
            LLRBNode lLRBNode2 = lLRBValueNodeQ.f19039d;
            if (comparator.compare(obj, lLRBValueNodeQ.f19036a) == 0) {
                if (lLRBNode2.isEmpty()) {
                    return LLRBEmptyNode.f19035a;
                }
                LLRBNode lLRBNodeH = lLRBNode2.h();
                lLRBValueNodeQ = lLRBValueNodeQ.l(lLRBNodeH.getKey(), lLRBNodeH.getValue(), null, ((LLRBValueNode) lLRBNode2).p());
            }
            lLRBValueNodeL = lLRBValueNodeQ.l(null, null, null, lLRBValueNodeQ.f19039d.d(obj, comparator));
        }
        return lLRBValueNodeL.m();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final void e(LLRBNode.NodeVisitor nodeVisitor) {
        this.f19038c.e(nodeVisitor);
        nodeVisitor.a(this.f19036a, this.f19037b);
        this.f19039d.e(nodeVisitor);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode g() {
        return this.f19039d;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getKey() {
        return this.f19036a;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getValue() {
        return this.f19037b;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode h() {
        return this.f19038c.isEmpty() ? this : this.f19038c.h();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode i() {
        LLRBNode lLRBNode = this.f19039d;
        return lLRBNode.isEmpty() ? this : lLRBNode.i();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean isEmpty() {
        return false;
    }

    public final LLRBValueNode j() {
        LLRBNode lLRBNode = this.f19038c;
        LLRBNode lLRBNodeC = lLRBNode.c(lLRBNode.f() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED, null, null);
        LLRBNode lLRBNode2 = this.f19039d;
        return c(f() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED, lLRBNodeC, lLRBNode2.c(lLRBNode2.f() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED, null, null));
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final LLRBValueNode c(LLRBNode.Color color, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        if (lLRBNode == null) {
            lLRBNode = this.f19038c;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.f19039d;
        }
        LLRBNode.Color color2 = LLRBNode.Color.RED;
        Object obj = this.f19036a;
        Object obj2 = this.f19037b;
        return color == color2 ? new LLRBRedValueNode(obj, obj2, lLRBNode, lLRBNode2) : new LLRBBlackValueNode(obj, obj2, lLRBNode, lLRBNode2);
    }

    public abstract LLRBValueNode l(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2);

    public final LLRBValueNode m() {
        LLRBValueNode<K, V> lLRBValueNodeQ;
        LLRBNode lLRBNode = this.f19039d;
        if (!lLRBNode.f() || this.f19038c.f()) {
            lLRBValueNodeQ = this;
        } else {
            lLRBValueNodeQ = (LLRBValueNode) lLRBNode.c(n(), c(LLRBNode.Color.RED, null, ((LLRBValueNode) lLRBNode).f19038c), null);
        }
        if (lLRBValueNodeQ.f19038c.f() && ((LLRBValueNode) lLRBValueNodeQ.f19038c).f19038c.f()) {
            lLRBValueNodeQ = lLRBValueNodeQ.q();
        }
        return (lLRBValueNodeQ.f19038c.f() && lLRBValueNodeQ.f19039d.f()) ? lLRBValueNodeQ.j() : lLRBValueNodeQ;
    }

    public abstract LLRBNode.Color n();

    public final LLRBValueNode o() {
        LLRBValueNode lLRBValueNodeJ = j();
        LLRBNode lLRBNode = lLRBValueNodeJ.f19039d;
        if (!lLRBNode.a().f()) {
            return lLRBValueNodeJ;
        }
        LLRBValueNode lLRBValueNodeL = lLRBValueNodeJ.l(null, null, null, ((LLRBValueNode) lLRBNode).q());
        LLRBNode.Color color = LLRBNode.Color.RED;
        LLRBNode lLRBNode2 = lLRBValueNodeL.f19039d;
        return ((LLRBValueNode) lLRBNode2.c(lLRBValueNodeL.n(), lLRBValueNodeL.c(color, null, ((LLRBValueNode) lLRBNode2).f19038c), null)).j();
    }

    public final LLRBNode p() {
        if (this.f19038c.isEmpty()) {
            return LLRBEmptyNode.f19035a;
        }
        LLRBValueNode<K, V> lLRBValueNodeO = (this.f19038c.f() || this.f19038c.a().f()) ? this : o();
        return lLRBValueNodeO.l(null, null, ((LLRBValueNode) lLRBValueNodeO.f19038c).p(), null).m();
    }

    public final LLRBValueNode q() {
        return (LLRBValueNode) this.f19038c.c(n(), null, c(LLRBNode.Color.RED, ((LLRBValueNode) this.f19038c).f19039d, null));
    }

    public void r(LLRBValueNode lLRBValueNode) {
        this.f19038c = lLRBValueNode;
    }
}
