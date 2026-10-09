package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l9) {
            return l9 == null ? JsonNull.INSTANCE : new JsonPrimitive(l9);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l9) {
            return l9 == null ? JsonNull.INSTANCE : new JsonPrimitive(l9.toString());
        }
    };

    public abstract JsonElement serialize(Long l9);
}
