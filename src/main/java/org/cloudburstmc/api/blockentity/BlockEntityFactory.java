package org.cloudburstmc.api.blockentity;

import com.nukkitx.math.vector.Vector3i;
import org.cloudburstmc.server.level.chunk.CloudChunk;

public interface BlockEntityFactory<T extends BlockEntity> {

    T create(BlockEntityType<T> type, CloudChunk chunk, Vector3i position);
}
