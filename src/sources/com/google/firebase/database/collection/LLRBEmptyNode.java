package com.google.firebase.database.collection;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LLRBEmptyNode<K, V> implements LLRBNode<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LLRBEmptyNode f19035a = new LLRBEmptyNode();

    private LLRBEmptyNode() {
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode b(Object obj, Object obj2, Comparator comparator) {
        LLRBEmptyNode lLRBEmptyNode = f19035a;
        return new LLRBRedValueNode(obj, obj2, lLRBEmptyNode, lLRBEmptyNode);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean f() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getKey() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final Object getValue() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final int size() {
        return 0;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode a() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode g() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode h() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode i() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final void e(LLRBNode.NodeVisitor nodeVisitor) {
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode d(Object obj, Comparator comparator) {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public final LLRBNode c(LLRBNode.Color color, LLRBValueNode lLRBValueNode, LLRBValueNode lLRBValueNode2) {
        return this;
    }
}
