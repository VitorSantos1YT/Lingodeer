package com.google.firebase.database.collection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LLRBBlackValueNode<K, V> extends LLRBValueNode<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19034e;

    public LLRBBlackValueNode(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        super(obj, obj2, lLRBNode, lLRBNode2);
        this.f19034e = -1;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean f() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final LLRBValueNode l(Object obj, Object obj2, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        if (obj == null) {
            obj = this.f19036a;
        }
        if (obj2 == null) {
            obj2 = this.f19037b;
        }
        if (lLRBNode == null) {
            lLRBNode = this.f19038c;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.f19039d;
        }
        return new LLRBBlackValueNode(obj, obj2, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final LLRBNode.Color n() {
        return LLRBNode.Color.BLACK;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public final void r(LLRBValueNode lLRBValueNode) {
        if (this.f19034e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f19038c = lLRBValueNode;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final int size() {
        if (this.f19034e == -1) {
            this.f19034e = this.f19039d.size() + this.f19038c.size() + 1;
        }
        return this.f19034e;
    }
}
