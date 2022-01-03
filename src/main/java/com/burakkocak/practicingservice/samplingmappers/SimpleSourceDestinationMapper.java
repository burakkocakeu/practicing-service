package com.burakkocak.practicingservice.samplingmappers;

import com.burakkocak.practicingservice.samplingmappers.pojo.SimpleDestination;
import com.burakkocak.practicingservice.samplingmappers.pojo.SimpleSource;
import org.mapstruct.Mapper;

/**
 * 4.2. The Mapper Interface
 * URL: https://www.baeldung.com/mapstruct#2-the-mapper-interface
 * Description: Notice we did not create an implementation class for our SimpleSourceDestinationMapper — because MapStruct creates it for us.
 *
 * 4.3. The New Mapper
 * URL: https://www.baeldung.com/mapstruct#3-the-new-mapper
 * Description: We can trigger the MapStruct processing by executing an mvn clean install.
 *
 * This will generate the implementation class under /target/generated-sources/annotations/.
 *
 * Here is the class that MapStruct auto-creates for us:
 */
@Mapper
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource simpleSource);

    SimpleSource destinationToSource(SimpleDestination simpleDestination);

}
