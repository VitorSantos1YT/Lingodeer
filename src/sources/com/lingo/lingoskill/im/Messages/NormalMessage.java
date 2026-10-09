package com.lingo.lingoskill.im.Messages;

import com.lingo.lingoskill.im.commons.IMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NormalMessage implements IMessage {
    private String content;
    private int type;
    private String uid;

    @Override // com.lingo.lingoskill.im.commons.IMessage
    public String getContent() {
        return this.content;
    }

    @Override // com.lingo.lingoskill.im.commons.IMessage
    public int getType() {
        return this.type;
    }

    @Override // com.lingo.lingoskill.im.commons.IMessage
    public String getUid() {
        return this.uid;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
